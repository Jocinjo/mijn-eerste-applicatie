public class schoolklas extends DifferentScanners{
    public String level;
    public schoolklas() {
        this.level = level;
    }
    public void klas() {
        level = askForString("Welk niveau doe je? ");
        System.out.println("Welkom in de " + level + "-klas!");
    }
}
