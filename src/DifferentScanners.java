import java.util.Scanner;

/*
ask for a number
ask for number within a range
ze moeten static zijn
 */
public class DifferentScanners {
    static Scanner input = new Scanner(System.in);

    static int askForNumber(String text) { //text is what will be asked from the console
        System.out.println(text);
        String scanned = input.next();
        int number = Integer.parseInt(scanned);
        return number;
    }

    static int askForNumberInRange(String text, int min, int max) { //this one will give a range to work with
        int number;
        do {
            System.out.println(text);
            String scanned = input.next();
            number = Integer.parseInt(scanned);
        }
        while (number < min || number > max);
        return number;
    }
}
