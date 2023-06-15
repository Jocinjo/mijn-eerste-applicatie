import java.util.Random;

public class Hotel implements IHotel {
    private static final String[] NAAM_STEDEN = {"Budapest", "Amsterdam", "Venetië"};
    private static final String[] NAAM_TEMPLATES = {"%s Hotel", "Hotel %s", "Grand hotel of %s"};
    private String hotelName;
    public Random choice = new Random();
    public final int totaalAantalHotelKamers = 10;
    public double verhoudingEenPersoonsKamers = 0.25;
    public double verhoudingTweePersoonsKamer = 0.25;
    public double verhoudingVierPersoonsKamer = 0.5;


    @Override
    public void checkInGuests(int numberOfGuests) {
        double aantalEenpersoonsKamers = totaalAantalHotelKamers * verhoudingEenPersoonsKamers;
        double aantalTweePersoonskamers = totaalAantalHotelKamers * verhoudingTweePersoonsKamer;
        double aantalVierPersoonsKamers = totaalAantalHotelKamers * verhoudingVierPersoonsKamer;

        if (numberOfGuests == 0) {
            System.out.println("Wij hebben geen kamer voor 0 personen. probeer opnieuw.\nStatus: niet gelukt.");
        } else if (numberOfGuests == 1) {
            System.out.println("Wij gaan voor je kijken");
            if (aantalEenpersoonsKamers - 1.0 > 0.0) {
                System.out.println("We hebben een kamer vrij");
                aantalEenpersoonsKamers -=1;

            } else {
                System.out.println("Er is gelaas geen kamer vrij.");
            }
        } else if (numberOfGuests == 2) {
            System.out.println("Wij gaan voor je kijken");
            if (aantalTweePersoonskamers - 1.0 > 0.0) {
                System.out.println("We hebben een kamer vrij");
                aantalTweePersoonskamers -=1;
            } else {
                System.out.println("Er gis geen kamer vrij.");
            }
        } else if (numberOfGuests == 3 || numberOfGuests == 4) {
            System.out.println("Wij gaan voor je kijken");
            if (aantalVierPersoonsKamers - 1.0 > 0.0) {
                System.out.println("We hebben een kamer vrij");
                aantalVierPersoonsKamers -=1;
            } else {
                System.out.println("Er gis geen kamer vrij.");
            }
        } else {
            System.out.println("Sorry probeer opnieuw!");
        }
    }







    @Override
    public String generateHotelName() {
        int stadskeuze = choice.nextInt(NAAM_STEDEN.length);
        int templateKeuze = choice.nextInt(NAAM_TEMPLATES.length);

        this.hotelName = String.format(NAAM_TEMPLATES[templateKeuze], NAAM_STEDEN[stadskeuze]);
        return this.hotelName;
    }

    @Override
    public String getHotelName() {
        return this.hotelName;
    }
}
