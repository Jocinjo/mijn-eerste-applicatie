/*
wat ik nodig heb:
- user pilot range en positie tussen 0 en 100.
user 2 die een cijfer geeft voor het vinden van de positie.
de range daat door totdat de ene f de andere stad dood is.
elke poging vertellen of user 2 te hoog of the laag zit.
damage per turn:
1 punt normaal gesproken
3 punten als het deelbaar is door 3. fireblast
3 punten als het deelbaar is door 5 electric blast.
10 punten als het deelbaar is door 5 én 3. fire-electric blast
consolas kan maar 15 punten hebben voordat die dood is.
 */
public class Dag_18 extends DifferentScanners {
    public Dag_18() {
    }

    int manticoresHealth = 10;
    int citysHealth = 15; //if manticore is still alive reduce health by 1.
    int round = 1;

    public void attackGame() { //not sure of we need it already here.
        //    make a method to ask for input from user 1

        int positionOfManticore = askForNumberInRange("Pilot where are you now? ", 0, 100);

        for (int i = 0; i < 51; i++) {
            System.out.println(i);
        }

//    make a method to ask for input from user 2.
        int attemptToAttack = askForNumber("Where do you thing the maticore is city of gonzales? ");


//    make a method to declare the amount of hitdamage

//    keep score of health points for the city
//    keep score of health points for the mantycore

//    waarschijnlijk een dowhile loop gebruiken voor alles.
    }
}
