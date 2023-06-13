/*
toString werkt hier eindelijk...

 */
public class Disney {
    public String film;
    public String wanneer;
    public Disney(String film, String wanneer) {
        this.film = film;
        this.wanneer = wanneer;
    }
    public void kijken () {
        System.out.println("Jij hebt als film gekozen om te kijken: " + film + "... " + wanneer + "?");
    }

    @Override
    public String toString() {
        return "Disney heeft in de naam van toString de filmnaam '" +
                 film + '\'' +
                ", en de film is wanneer? nou... '" + wanneer + "'\'";
    }
}
