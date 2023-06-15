import java.util.Random;

public class Gast {
    private String achternaam, voornaam;
    private static final String [] VOORNAMEN = {"Adam", "Sophie", "Freek"};
    private static final String [] ACHTERNAMEN ={"de Vries", "van Loon", "Bakker"};

    public Gast(String voornaam, String achternaam){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public Gast() { //deze moet willekeureige namen kiezen
        this(VOORNAMEN, ACHTERNAMEN, achternaam, voornaam);
        voornaam = VOORNAMEN;
        achternaam = ACHTERNAMEN;
         Random choice = new Random();
        String voornaamKeuze = choice.next(VOORNAMEN);
        achternaam = ACHTERNAMEN[choice.next()];
//        voornaamKeuze =
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setVoornaam(voornaam  = VOORNAMEN[choice.next()]) {}

    public void setAchternaam(String achternaam = ACHTERNAMEN[choice.nect()]) {}

    public String getname() {
        return this.voornaam + " " + this.achternaam;
    }
}
