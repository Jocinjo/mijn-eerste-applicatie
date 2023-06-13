public class TryCatch extends DifferentScanners{
    public static void main(String[] args) {
        try {
            int nummer = 5 / 1;

        } catch (ArithmeticException e) {
            System.out.println(e + "\nDit is niet goed!");
        } finally {
            System.out.println("zo lang het maar geen 0 is. deze print altijd");
        }
        int getal = askForNumberInRange("geef een nummer", -100, 1000);
        System.out.println(getal);

        int cijfer = askForNumber("geef een nummer nog een keer");
        System.out.println(cijfer);

        try {
            int poging = 10/0;
            System.out.println(poging);
        } catch (ArithmeticException e) {
            System.out.println(e + " Je kan niet delen door nul.");
        } finally {
            System.out.println("is het al gelukt om de zerodivision niet te krijgen?");
            //deze werkt ook
        }
    }
}
