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


    }
}
