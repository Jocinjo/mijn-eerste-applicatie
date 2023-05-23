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
}
