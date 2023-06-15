import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int getal = scan.nextInt();
        int even = 0;
        int oneven = 0;
        for (int i = 0; i <= getal; i++) { // loop het aantal keer dat de gebruiker aangeeft
            if (i % 2 == 0) { // test of het huidige getal even of oneven is
                even = even + i; // het getal si even, dus tel het op bij even
            } else {
                oneven = oneven + i; // het getal is oneven dus tel het op bij oneven
            }
        }
        System.out.println("Even: " + even + " Oneven: " + oneven);
        System.out.println("verschil: " + Math.abs(even - oneven));
    }

    public static int getGetal() {
        System.out.println("Geef een positief getal");
        Scanner scanner = new Scanner(System.in);
        int getal = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                getal = scanner.nextInt();
                if (getal > 0) {
                    validInput = true;
                } else {
                    System.out.println("Je hebt geen positief getal ingevoerd");
                }
            } catch (InputMismatchException e) {
                System.out.println("Je hebt geen geldig getal ingevoerd");
                scanner.next();
            }
        }

        return getal;
    }

}
