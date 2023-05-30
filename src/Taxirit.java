public class Taxirit {
    private double prijsPerKm = 1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;

    public Taxirit(double afstand) {
        this(afstand, 1, 4);


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
        int nieuweAantal = persoon + aantalPers;

    }

    public double berekenPrijsPerPersoon() {

        if (aantalPers < maxAantal) {
            return prijsPerKm * afstand;
        }
        return prijsPerKm * afstand * 0.9;
    }
}

