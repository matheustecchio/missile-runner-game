import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;  // Generate random numbers in the range 1 to 10

        System.out.println("Random Number: " + randomNumber);
    }
}