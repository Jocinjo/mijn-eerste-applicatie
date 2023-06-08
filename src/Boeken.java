//deze werkt nog niet
public class Boeken extends Exception{
    boolean boekGevonden;

    public Boeken() {

    }
    void geefLes() throws BoekNietGevondenException {
        boolean boekGevonden = zoekBoek(true);

        if (!boekGevonden) {
            throw new BoekNietGevondenException("You haven't found a book yet so we will stop!");
        }else {
            leesBoek();
            legUit();
        }
    }
    void zoekBoek(boolean boekGevonden) {
        this.boekGevonden = boekGevonden;
        if (boekGevonden = true) {
            System.out.println("ik heb een boek gevonden");
            leesBoek();
            legUit();
        } else {geefLes();}
    }
    void leesBoek() {
        System.out.println("ik heb het boeg gelezen");
    }
    void legUit() {
        System.out.println("het boek gaat over...");
    }
}
