import java.util.Scanner;

/*
vraag user 1 de piloot om een nummer tussen 0 en 100 te geven. als het nummer niet goed is dan vraag opnieuw.
maak het beeld leeg door 50x lege tekstregels.
vraag nummer 2 om het nummer te raden.
zeg als het geraden nummer te hoog of te laag is.
geef ook aan als het wel geraden is.

de do while loop werkt anders dan de while loop. in dit specifieke geval werkt de while loop niet.
 */
public class Dag_12 extends DifferentScanners {
    public Dag_12() {}
    public void spelletje() {
        Scanner input = new Scanner(System.in);
        int pilotNumber;
        pilotNumber = askForNumberInRange("Pilot will you please give us a number between 0 and 100: ", 0, 100);

//        do {
//            System.out.println("pilot will you please give us a number between 0 and 100: ");
//            pilotNumber = input.nextInt();
//            System.out.println("please try again pilot! ");
//        }
//        while (pilotNumber < 0 ||pilotNumber > 100);

        for(int i = 0; i <51; i++) {
            System.out.println(i);
        }
        int guessUser;

        do {
            System.out.println("User 2 what number do you think the pilot chose? ");
            guessUser = input.nextInt();
            if(guessUser < pilotNumber) {
                System.out.println("Your guess is too low!");
            }
            else if(guessUser > pilotNumber) {
                System.out.println("Your guess is too high");
            }
        }
        while(guessUser != pilotNumber);
        System.out.println("you've guessed the number. it was indeed: " + pilotNumber + "!");
    }
}
