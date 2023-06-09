import java.util.Scanner;
public class Dag_9 extends DifferentScanners{
    public Dag_9() {
    } // vergeet deze haak niet hier. gaat iedere keer fout.
        public void clock() {
//            Scanner input = new Scanner(System.in);
//            System.out.println("give a number: ");
//            int number = input.nextInt();
            int number =askForNumber("give a number: ");
            if (number % 2 == 1) {
                System.out.println("Tock");
            } else {
                System.out.println("Tick");

            }
        }
    }


