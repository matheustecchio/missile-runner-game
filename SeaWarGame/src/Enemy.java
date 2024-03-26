public class Enemy {
    private byte missiles = 10;

    void throwMissile(int x, int y, Player... players) {

    if (missiles > 0) {
        missiles--;

        System.out.println("\nEnemy is throwing a missile at (" + x + ", " + y + ")");
        for (Player player : players) {
            float damagedHealth = player.getHealth();
            
            // Check if the missile hit the player directly
            if (player.getPositionX() == x && player.getPositionY() == y) {
                damagedHealth -= 1;
                player.setHealth(damagedHealth);
                System.out.println("\n" + player.getName() + ", you got hit!");
            }
            // Check if the missile grazed the player
            else if (Math.abs(player.getPositionX() - x) <= 1 && Math.abs(player.getPositionY() - y) <= 1) {
                damagedHealth -= 0.5;
                player.setHealth(damagedHealth);
                System.out.println("\n" + player.getName() + ", you got grazed!");
            }
        }
    } else { System.out.println("\nThe enemy has no more missiles left."); }
  }

    public byte getMissiles() {
        return missiles;
    }

    public void setMissiles(byte missiles) {
        this.missiles = missiles;
    }

}
