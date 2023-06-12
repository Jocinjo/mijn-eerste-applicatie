

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


//        tombOfAgolTheWise();
//        Dag_18 attack = new Dag_18();
//        attack.guessPosition();

//        int i = 128;
//        byte b = (byte) i;
//        System.out.println(b); //blijkbaar kun je niet van int naar byte typecasten omdat je dan -128 krijgt.

        byte trein = 120; // 1111000
        System.out.println(isLichtAan(trein));
        System.out.println(rijRichting(trein));
        System.out.println(trein);
    }

    public static boolean isLichtAan(int trein) {
        return (trein >> 3 & 1) == 1;
    }

    public static boolean rijRichting(int trein) {
        return (trein >> 3 & 1) == 1;
    }

    public static boolean snelheid(int trein) {
        //moet 67 uitkomen dus 64 2 1
        return (trein >> 4 & 11) == 1;
    }


}


