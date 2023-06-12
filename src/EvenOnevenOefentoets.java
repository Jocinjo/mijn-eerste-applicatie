/*
de opdracht:
geef een positief getal met de scanner next int.
verkeerde invoer moet afgehandeld worden.
maak een som van alle evengetatten tot de laatste van de scanner. dus 1 tot scannergetal.
maak een som van 1 tot scannergetal voor de oneven getallen.
als laatste het verschil tussen die twee laten printen.
 */
public class EvenOnevenOefentoets extends DifferentScanners {
    // met onderstaande wort hij eigenlijk geparsed
    public static int evenCijfer;
    public static int onevenSom;
    public static int evenSom;
    public int optelCijfer = 0;

    public EvenOnevenOefentoets() {
        this.evenCijfer = evenCijfer;
        this.onevenSom = onevenSom;
        this.evenSom = evenSom;
    }

    public int bepaalCijfer() {


        int evenCijfer = askForNumber("Geef een positief en even cijfer: ");

        while (evenCijfer < 0) {
            evenCijfer = askForNumber("Geef een positief en even cijfer: ");
            if (evenCijfer < 0) {
                System.out.println("Je hebt een verkeerd antwoord gegeven. Ik vroeg om een evengetal en/of positief getal.");
            } else {
                System.out.println("Goed gedaan we gaan door!");

            }
        }

        return evenCijfer;
    }

    public int evenSomMaken() {

        this.optelCijfer = optelCijfer;
        this.evenCijfer = evenCijfer;
        int beginCijfer = 0;
        int temp = 0;
        this.evenCijfer = evenCijfer;
        for (beginCijfer = 0; beginCijfer <= evenCijfer; beginCijfer++) {
//            beginCijfer = 0;
            int tussenSom = beginCijfer + optelCijfer;
            int beginSom = 0 + beginCijfer;
//            int tussenSom = beginSom;
            if (beginCijfer % 2 == 1) {
                continue;
            } else {
                System.out.println(beginCijfer);
            }
            evenSom = beginCijfer;
            System.out.println(evenSom);
//

        }

        while (beginCijfer != evenCijfer) {
            temp += beginCijfer;
            if (beginCijfer % 2 == 0) {
                beginCijfer++;
                break;
            }
                System.out.println(beginCijfer++);

        }
        return evenSom;

    }

    public int onevenSomMaken() {
        int beginCijfer;
        for (beginCijfer = -1; beginCijfer < evenCijfer; beginCijfer += 2) {
            int temp = beginCijfer + 2;
            temp = onevenSom;
        }
        System.out.println(onevenSom);
        System.out.println(evenSom - onevenSom);
        return onevenSom;
    }

    public void allesBijElkaar() {
        bepaalCijfer();
        evenSomMaken();
        onevenSomMaken();
        System.out.println(evenSom);
        System.out.println(onevenSom);
    }
public void telAlles () {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                evenSom = evenSom + i;}
            else {onevenSom = onevenSom + i;}
            System.out.println(i);
            System.out.println(evenSom);
            System.out.println(onevenSom);
        }


}
}
