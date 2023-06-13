/*
toString werkt hier eindelijk...

 */
public class Disney extends DifferentScanners {
    public String film;
    public String wanneer;
    private int releaseYear;


    public Disney(String film, String wanneer, int releaseYear) {
        this.film = film;
        this.wanneer = wanneer;
        this.releaseYear = releaseYear;
    }

    public void kijken() {
        System.out.println("Jij hebt als film gekozen om te kijken: " + film + "... " + wanneer + "?");
    }

    @Override
    public String toString() {
        return "Disney heeft in de naam van toString de filmnaam '" +
                film + '\'' +
                ", en de film is wanneer? nou... '" + wanneer + "'\'";
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear < 1900) {
            System.out.println("dat kan niet");
            setReleaseYear(askForNumberInRange("Dat nummer kan niet, geef een nieuw nummer: ", 1900, 2400));
        } else {
            this.releaseYear = releaseYear;
        }
    }
}
