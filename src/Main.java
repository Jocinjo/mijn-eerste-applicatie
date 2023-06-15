/*
 Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
 then press Enter. You can now see whitespace characters in your code.
check of hij het nog steeds doet.

 shift F6 gebruiken om een naam te veranderen maar alle verwijzingen ook meteen mee te veranderen.
 */



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


        Disney frozen = new Disney("Frozen", "woensdag", 500);
        System.out.println(frozen);
        System.out.println(frozen.getReleaseYear());

        frozen.setReleaseYear(500);
        System.out.println(frozen.getReleaseYear());



    }
}


