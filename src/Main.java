

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

        try {
            FileInputStream fis = new FileInputStream("test.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IndexOutOfBoundsException e){
            System.out.println("deze laat hij alleen zien als de eerste fout een out of bounds is");
        }finally {
            System.out.println("Try exception is done");
        }

    }
}

