/*
x stap 1: laat het programma een getal tussen 1 en 1000 kiezen
x stap 2: vraag gebruiker om input met getal.
x stap 3: geef feedback over of heyt getal hoger of later of goed.
x stap 4:zorg dat het programma 10 beurten geeft voor het raden. als er na 10 beurten nog niet het juiste getal is geraden laat dan hett juiste nummer zien.
optioneel stap 5: zorg dat hij opniuw kan spelen zonder dat het programma stopt.
 */
/*
 */

import java.util.Scanner;

public class getal_rader {
    public static void main(String args[]) {
        Scanner getal = new Scanner(System.in);
        String game = "yes";

        while(game.equals("yes")) {
            int beurten = 0;
            int randomNum = (int) (Math.random() * 1001);  // 0 to 1000
            System.out.println(randomNum);
            while (beurten < 10) {
                System.out.println("Enter your guess ");
                int gerade_getal = getal.nextInt();
                beurten++;
                if (randomNum == gerade_getal) {
                    System.out.println("Goed zo je hebt het getal geraden.");
                    System.out.println("Wil je nog een keer spelen");
                    beurten = 10;
                    game = getal.next().toLowerCase();
                }
                else if (randomNum < gerade_getal) {
                    System.out.println("Het getal is kleiner");
                }
                else {
                    System.out.println("Het getal is groter");
                }

            }
        }
    }
}
