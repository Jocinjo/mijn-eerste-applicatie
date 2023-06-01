

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog steeds doet.

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gave a number");
        int left = input.nextInt();
        System.out.println("gave a second number");
        int right = input.nextInt();

        Dag_8 josie = new Dag_8(left, right);
        josie.positie();


    }
}

