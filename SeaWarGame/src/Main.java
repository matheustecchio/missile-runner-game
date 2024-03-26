import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("\nEnter Player 1's name: ");
        String player1Name = sc.nextLine();
        Player player1 = new Player(player1Name, 1, 1);

        System.out.print("\nEnter Player 2's name: ");
        String player2Name = sc.nextLine();
        Player player2 = new Player(player2Name, 10, 10);

        Enemy enemy = new Enemy();

        // Game loop
        while (true) {
            
            // Player 1's turn
            move (player1);
            // Check if Player 1 has 0 energy or health units
             if (player1.getEnergy() == 0 || player1.getHealth() == 0) {
                System.out.println("\n" + player1.getName() + " has been defeated. " + player2.getName() + " is the winner!");
                break;
            }
            
            // Player 2's turn
            move (player2);
            // Check if Player 2 has 0 energy or health units
            if (player2.getEnergy() == 0 || player2.getHealth() == 0) {
                System.out.println("\n" + player2.getName() + " has been defeated. " + player1.getName() + " is the winner!");
                break;
            }

            // Enemy's turn
            int missileX = rand.nextInt(10);
            int missileY = rand.nextInt(10);
            enemy.throwMissile(missileX, missileY, player1, player2);

            // Check if the enemy has no more missiles
            if (enemy.getMissiles() == 0) {
                System.out.println("The enemy has been defeated. The players are victorious!");
                break;
            }
        }

        sc.close();
    }
    
    public static void move (Player aPlayer) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n" + aPlayer.getName() + ", enter your move direction(N, S, E, W): ");
            String direction = sc.next();
            System.out.print(aPlayer.getName() + ", enter how many units you want to move: ");
            int units = sc.nextInt();
            aPlayer.move(direction, units);

            // Check if the move was valid and print out the move
            if (aPlayer.isValidMove() == true) { 
                System.out.println("\n" + aPlayer.getName() + " is running " + units +" units " + aPlayer.getFullDirection() + ".");
                aPlayer.checkLanding();
                aPlayer.location();
                break;
            }
        }

    }
}
