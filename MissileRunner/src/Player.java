public class Player {
    private String name;
    private float health = 5;
    private int energy = 3;
    private int positionX, positionY;
    private boolean validMove;

    private String fullDirection;


    Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    void move(String direction, int units) {
        int newX = this.positionX;
        int newY = this.positionY;

        this.validMove = false;
    
        switch (direction.toUpperCase()) {
            case "N":
                newY += units;
                this.validMove = true;
                this.fullDirection = "North";
                break;
            case "S":
                newY -= units;
                this.validMove = true;
                this.fullDirection = "South";
                break;
            case "E":
                newX += units;
                this.validMove = true;
                this.fullDirection = "East";
                break;
            case "W":
                newX -= units;
                this.validMove = true;
                this.fullDirection = "West";
                break;
            default:
                System.out.println("\nInvalid direction. Please enter N, S, E, or W.");
                return;
        }


            this.positionX = newX;
            this.positionY = newY;
        
    } 

    // Check if player is on water and back if so.
    void checkLanding() {
        if (this.positionX > 10|| this.positionX < 1 || this.positionY > 10 || this.positionY < 1) {
            System.out.println("\n" + this.name + " fell in the water and moved as soon as possible on the land!");
            this.energy--;
        }

        if (this.positionX > 10) { this.positionX = 10; }
        if (this.positionY > 10) { this.positionY = 10; }
        if (this.positionX < 0) { this.positionX = 1; }
        if (this.positionY < 0) { this.positionY = 1; }

    }

    public void location() {
        System.out.printf("%s is now at (%d, %d) with %d of energy, and %.1f of health.\n", this.name, this.positionX, this.positionY, this.energy, this.health); }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isValidMove() {
        return validMove;
    }

    public void setValidMove(boolean validMove) {
        this.validMove = validMove;
    }

    public String getFullDirection() {
        return fullDirection;
    }

    public void setFullDirection(String fullDirection) {
        this.fullDirection = fullDirection;
    }


}
