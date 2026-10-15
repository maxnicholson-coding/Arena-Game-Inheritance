public class Character {
    //initialize variables
    private String name;
    private int health;
    private int maxHealth;
    private int level;
    public Character(String name, int maxHealth) {
        //checks if the name is empty and makes the name Unknown if so
        this.name = name == null || name.isBlank() ? "Unknown" : name;
        //makes max health 100 if the input is not positive
        this.maxHealth = maxHealth > 0 ? maxHealth : 100;
        this.health = this.maxHealth;
        this.level = 1;
    }
    public String getName() { //returns the character's name
        return name;
    }
    public int getHealth() { //returns the current health
        return health;
    }
    public int getLevel() { //returns the current level
        return level;
    }
    public void levelUp() { //adds one to level
        level++;
    }
    public void takeDamage(int damage) { //reduces health of the character
        //subtracts health from character if damage is postive
        if (damage > 0) {
            health -= damage;
            //sets health to 0 if it is negative
            if (health < 0) {
                health = 0;
            }
        }
    }
}
