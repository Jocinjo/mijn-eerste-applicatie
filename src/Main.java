

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog steeds doet.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



//        Dag_15 freach = new Dag_15();
//        freach.min();

        Boeken alice = new Boeken();
        alice.zoekBoek(true);
        alice.geefLes();
    }
}

