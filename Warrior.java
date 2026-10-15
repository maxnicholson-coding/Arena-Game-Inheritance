public class Warrior extends Character {
    //initialize variables
    private int armor;
    public Warrior(String name, int maxHealth, int armor) {
        //assigns the values using the Character method
        super(name, maxHealth);
        //makes armor 0 if armor input was negative
        this.armor = Math.max(0, armor);
    }
    public int getArmor() { //return's the warrior's armor
        return armor;
    }
    public void heavyAttack() { //warrior does a heavy attack
        System.out.println(getName() + " performs a heavy attack!");
    }
}
