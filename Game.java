public class Game
{
    public static void main(String[] args)
    {
        //create characters, one of each class
        Warrior w = new Warrior("Brad", 120, 4);
        Mage m = new Mage("Gandalf", 75, 8);
        Ranger r = new Ranger("Robin", 95, 15);
        
        //print each character's stats
        System.out.println("- Warrior -\nName: " + w.getName() + "  Health: " + w.getHealth() + "  Level: " + w.getLevel() + "  Armor: " + w.getArmor());
        System.out.println("- Mage -\nName: " + m.getName() + "  Health: " + m.getHealth() + "  Level: " + m.getLevel() + "  Mana: " + m.getMana());
        System.out.println("- Ranger -\nName: " + r.getName() + "  Health: " + r.getHealth() + "  Level: " + r.getLevel() + "  Arrows: " + r.getArrows());
        System.out.println();
        
        //call each character's unqiue action
        w.heavyAttack();
        m.castSpell();
        r.shootArrow();
        
        //damage and level up everyone
        w.takeDamage(20);
        m.takeDamage(25);
        r.takeDamage(10);
        w.levelUp();
        m.levelUp();
        r.levelUp();
        System.out.println();
        
        //reprint stats
        System.out.println("- Warrior -\nName: " + w.getName() + "  Health: " + w.getHealth() + "  Level: " + w.getLevel() + "  Armor: " + w.getArmor());
        System.out.println("- Mage -\nName: " + m.getName() + "  Health: " + m.getHealth() + "  Level: " + m.getLevel() + "  Mana: " + m.getMana());
        System.out.println("- Ranger -\nName: " + r.getName() + "  Health: " + r.getHealth() + "  Level: " + r.getLevel() + "  Arrows: " + r.getArrows());
        System.out.println();
        
        //demonstrating edge-cases
        Warrior test = new Warrior("", -50, -3);
        /*
        the Character method makes the name "Unknown" since the input is the empty String
        the Character method makes the health 100 since the input is negative
        the Warrior method makes the armor 0 since the input is negative (Mage and Ranger have similar checks)
        */
        System.out.println("- Test Warrior -\nName: " + test.getName() + "  Health: " + test.getHealth() + "  Level: " + test.getLevel() + "  Armor: " + test.getArmor());
        //if negative damage would be taken it is nullified
        test.takeDamage(-10);
        System.out.println("Test Warrior Health: " + test.getHealth());
        //if health would be reduced below 0, it is set to 0
        test.takeDamage(9001);
        System.out.println("Test Warrior Health: " + test.getHealth());
    }
}
