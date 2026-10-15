public class Mage extends Character {
    //initialize variable
    private int mana;
    public Mage(String name, int maxHealth, int mana) {
        //assigns the values using the Character method
        super(name, maxHealth);
        //makes mana 0 if mana input was negative
        this.mana = Math.max(0, mana);
    }
    public int getMana() { //returns the mana of the mage
        return mana;
    }
    public void castSpell() { //mage performs a spell, if they have the mana
        if (mana >= 5) {
            mana -= 5;
            System.out.println(getName() + " casts a spell!");
        } else {
            System.out.println(getName() + " is out of mana.");
        }
    }
}
