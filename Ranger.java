public class Ranger extends Character {
    //initialize variables
    private int arrows;
    public Ranger(String name, int maxHealth, int arrows) {
        //assigns the values using the Character method
        super(name, maxHealth);
        //makes arrows 0 if arrows input was negative
        this.arrows = Math.max(0, arrows);
    }
    public int getArrows() { //returns the number of arrows held
        return arrows;
    }
    public void shootArrow() { //ranger shoots an arrow, if they have one
        if (arrows > 0) {
            arrows--;
            System.out.println(getName() + " shoots an arrow!");
        } else {
            System.out.println(getName() + " is out of arrows.");
        }
    }
}
