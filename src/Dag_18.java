/*
wat ik nodig heb:
+ - user pilot range en positie tussen 0 en 100.
+ user 2 die een cijfer geeft voor het vinden van de positie.
de range daat door totdat de ene f de andere stad dood is.
elke poging vertellen of user 2 te hoog of the laag zit.
+ damage per turn:
1 punt normaal gesproken
3 punten als het deelbaar is door 3. fireblast
3 punten als het deelbaar is door 5 electric blast.
10 punten als het deelbaar is door 5 én 3. fire-electric blast
consolas kan maar 15 punten hebben voordat die dood is.
 */
public class Dag_18 extends DifferentScanners {
    public Dag_18() {
    }

    static int round;
   static int hitDamage;
//    keep score of health points for the mantycore
    static int manticoresHealth = 10;
    static int citysHealth = 16; //if manticore is still alive reduce health by 1.

    //    keep score of health points for the city

    static void cityHealtsCounter() {
        citysHealth--;
    }
static void manticoreHealthCounter(){
        hitDamagePerRound();
}
    //    declare roundnumber
    static void countRounds() {

        int turn = 1;
        round = turn++;
        System.out.println("Round: " + round);

    }

    //    make a method to declare the amount of hitdamage pas als het cijfer gelijk is gaat dit in.
    static void hitDamagePerRound() {

        if (round % 3 == 0 && round % 5 == 0) {
            System.out.println("you've dealt 10 damage-points at the Manticore with the electric fire blast!");
            hitDamage = 10;
            manticoresHealth =- hitDamage;
        } else if (round % 3 == 0) {
            System.out.println("you've dealt 3 damage-points at the Manticore with the fire blast!");
            hitDamage = 3;
            manticoresHealth =- hitDamage;

        } else if (round % 5 == 0) {
            System.out.println("you've dealt 3 damage-points at the Manticore with the electric blast!");
            hitDamage = 3;
            manticoresHealth =- hitDamage;

        } else {
            System.out.println("you've dealt 1 damage-point at the Manticore with the normal blast!");
            hitDamage = 1;
            manticoresHealth =- hitDamage;

        }
    }

    static void statusBeforeRightAnswer() {
        System.out.println("STATUS: Round: " + round + "City: " + citysHealth + "/15 Manticore: " + manticoresHealth + "/10 the cannon is expected to deal 1 damage.");
    }

    static void statusAfterRightAnswer() {
        System.out.println("STATUS: Round: " + round + "City: " + citysHealth + "/15 Manticore: " + manticoresHealth + "/10 the cannon is expected to deal"+ hitDamage + " damage.");
    }


    public void guessPosition() { //not sure of we need it already here.
        //    make a method to ask for input from user 1

        int positionOfManticore = askForNumberInRange("Pilot where are you now? ", 0, 100);

        for (int i = 0; i < 51; i++) {
            System.out.println(i);
        }
        int attemptToAttack;
//    make a method to ask for input from user 2.
        do {
            countRounds();
            cityHealtsCounter();
            statusBeforeRightAnswer();
            attemptToAttack = askForNumber("Where do you thing the manticore is city of gonzales? ");
            if (attemptToAttack < positionOfManticore) {
                System.out.println("The number is too low, try again: ");
            } else if (attemptToAttack > positionOfManticore) {
                System.out.println("The number is too high, try again: ");
            } else {
                System.out.println("Well done! The number was " + positionOfManticore + " and it is round: " + round);
                break;
            }


        } while (attemptToAttack != positionOfManticore || citysHealth != 0);

        do { // hij werkt nog niet.
            countRounds();

            manticoreHealthCounter();
            hitDamagePerRound();
            statusAfterRightAnswer();
            break;

        } while (manticoresHealth != 0);

//    waarschijnlijk een dowhile loop gebruiken voor alles. zelfs twee. want de damage komt daarna.
    }
}
