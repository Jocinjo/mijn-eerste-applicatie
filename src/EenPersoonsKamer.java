public class EenPersoonsKamer extends Kamer {

    public EenPersoonsKamer(int grootte) {
        super(grootte);
    }

    @Override
    public String getKamerType() {
        return null;
    }

    @Override
    public void checkInGuests(Gast[] guests) throws Exception {
        //de exception moet misschien zijn dat het maar 2 kamers mogen zijn in toaal.
    }

    @Override
    public void printGasten() {
        //
    }
}
