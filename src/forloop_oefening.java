public class forloop_oefening extends DifferentScanners {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " " + (i + 2));


        }
        System.out.println("hier was oefening 1\n");


        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("hier was oefening 2\n");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println("Dit is oneven en het getal is: " + i);
            } else {
                System.out.println("Dit is een even nummer en het getal is: " + i);
            }
        }
        System.out.println("hier was oefening 3\n");

        int nummer = askForNumber("Geef alsjebieft een nummer");
//    ik denk dat 0 niet mag vanwege division divider.
        for (int i = 0; i <= nummer; i++) {
            if (i % 2 == 1) {
                System.out.println("Dit is een onevennummer namelijk: " + i);
            } else {
                System.out.println("Dit is een even nummer namelijk: " + i);
            }
        }
        System.out.println("hier was oefening 4\n");

        int evennummer = 0, onevennummer = 0;
        nummer = askForNumber("Geef alsjeblieft nog een nummer");
        for (int i = 0; i <= nummer; i++) {
            if (i % 2 == 1) {
                System.out.println("Dit is een onevennummer nameklijk: " + i);
                onevennummer += i;
            } else {
                System.out.println("Dit is een even nummer namelijk: " + i);
                evennummer += i;
            }
        }
        System.out.println("Dit is het evennummer: " + evennummer + " en dit is het onevennummer: " + onevennummer + " en het verschil is " + (evennummer - onevennummer));
        System.out.println("Dit was oefening 5 en nu worden de waarden overschreven in een loop!\n");

        int years = 10;
        for (int i = 0; i <= 10; i++) {
            years += i;
        }
        System.out.println("you are " + years + " old.");
        System.out.println("Dit was oefening 6 met de voorloop\n");
    }
}
