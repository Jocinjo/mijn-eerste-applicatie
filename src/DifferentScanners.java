import java.util.Scanner;

/*
ask for a number
ask for number within a range
ze moeten static zijn
 */
public class DifferentScanners {
    static Scanner input = new Scanner(System.in);

    static int askForNumber(String text) { //text is what will be asked from the console
        int number = Integer.MIN_VALUE;
        System.out.println(text);
        String scanned = input.next();
        try {
            return Integer.parseInt(scanned);
        } catch (NumberFormatException e) {
            System.out.println(e + "\nhet is geen cijfer");
            askForNumber(text);
        }
        return number;
    }

    static int askForNumberInRange(String text, int min, int max) { //this one will give a range to work with
        int number = min -1;
        do {
            System.out.println(text);
            String scanned = input.next();
            try {
                number = Integer.parseInt(scanned);
            } catch (NumberFormatException e) {
                System.out.println(e + "\ngeef alsjebieft een nummer en geen andere karakters.");
            }
        } while (number < min || number > max);
        return number;
    }
}
