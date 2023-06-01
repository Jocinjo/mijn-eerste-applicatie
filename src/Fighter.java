public class Fighter extends Character implements IClass {

    public void speak() {
        System.out.println("I'm a Fighter.");
    }
    public void printStats() {
        System.out.println("Your dex is" + getDexterity());
        System.out.println("Your intelligence is" + getIntelligence());
    }
    public void die() {
        System.out.println("I'll die at d10");
    }

}
