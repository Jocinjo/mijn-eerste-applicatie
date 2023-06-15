import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gast josie = new Gast("Josie", "Test");
        Gast test = new Gast();
        test.setAchternaam();
        test.setVoornaam();
        System.out.println(test.getAchternaam());
        System.out.println(test.getVoornaam());
        System.out.println(josie);
        System.out.println(test);
    }


}
