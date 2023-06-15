import java.util.Random;

public class Gast {
    private String achternaam, voornaam;
    private static final String [] VOORNAMEN = {"Adam", "Sophie", "Freek"};
    private static final String [] ACHTERNAMEN ={"de Vries", "van Loon", "Bakker"};
    public Random choice = new Random();


    public Gast(String voornaam, String achternaam){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public Gast() { //deze moet willekeureige namen kiezen
       this.voornaam = voornaam;
       this.achternaam = achternaam;

    }

    public void setVoornaam() {
        int voornaamKeuze = choice.nextInt(VOORNAMEN.length);
        this.voornaam = VOORNAMEN[voornaamKeuze];

    }


    public void setAchternaam() {
        int achternaamKeuze = choice.nextInt(ACHTERNAMEN.length);
        this.achternaam = ACHTERNAMEN[achternaamKeuze];
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    @Override
    public String toString() {
        return "De voornaam van de gast is: " + voornaam + " en de achternaam is: " + achternaam;
    }
}

