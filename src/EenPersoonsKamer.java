public class EenPersoonsKamer extends Kamer{
    public static int aantalEenPersoonsKamers = 2;

    public EenPersoonsKamer() {
        aantalEenPersoonsKamers--;
        if (aantalEenPersoonsKamers == 0) {
            System.out.println("Je kan niet meer eenpersoonskamers verhuren. Die zijn volgeboekt.");

        }
    }
    @Override
    public String getKamerType() {
        return null;
    }

    @Override
    public void checkInGuests(Gast[] guests) throws Exception {

    }

    @Override
    public void printGasten() {

    }
}
