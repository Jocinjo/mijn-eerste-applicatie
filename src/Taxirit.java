public class Taxirit {
    private double prijsPerKm = 1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;

    public Taxirit(double afstand) {
        this(afstand, 1, 4); //dit slaat aan op de volgende constructor volgorde.


        System.out.println("je hebt " + afstand + " KM gereden!");
    }

    public Taxirit(double afstand, int aantalPers, int maxAantal) {
        this.aantalPers = aantalPers;
        this.maxAantal = maxAantal;
        this.afstand = afstand;

        int percentage = aantalPers / maxAantal;

        System.out.println("de afstand die gereden is, is " + afstand + "en het percentage dat jullie moeten betalen is" + percentage);
    }
    public void voegPersoonToe(int persoon) {
        //eventueel kanje een if maken voor dat je niet boven max kan
        aantalPers += persoon;

    }

    public double berekenPrijsPerPersoon() {

        if (aantalPers < maxAantal) {
            return prijsPerKm * afstand / aantalPers;
        }
        return prijsPerKm * afstand * 0.9 / aantalPers;
    }
}

