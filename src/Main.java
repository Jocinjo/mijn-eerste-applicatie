import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog steeds doet.
public class Main{
    public static void main(String[] args) {

//       Dag_7 persoon = new Dag_7();
//       persoon.totalPoints();
//       persoon.totalPoints();
//       persoon.totalPoints();

//       Dag_8 bord = new Dag_8();
//       bord.make();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of coordinates: ");
        int getal = input.nextInt();
        Dag_8 dag8 = new Dag_8(getal);
        dag8.make();

//        hij laat nog wel alle 4ren onder elkaar zien. kijken of ik dat nog kan fixen.




    }
}

