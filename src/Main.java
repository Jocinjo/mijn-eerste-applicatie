

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog steeds doet.

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Fighter josie = new Fighter();
        josie.Character(Gender.WOMAN, 8, "Josie");
        josie.die();
        josie.levelUp();
        josie.speak();
        josie.setDexterity(random.nextInt(18));
        josie.setIntelligence(random.nextInt(18));
        josie.printStats();


    }
}

