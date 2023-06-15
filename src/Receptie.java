/*
in de receptie wil ik eigenlijk een volgorde.
- naam
- hoeveel personen
checken of er plek is
-en dan reserveren of stoppen.
 */
public class Receptie extends Hotel implements IReceptie {
    public void runningAHotelByTheReception() {
        int choiceAtReception = DifferentScanners.askForNumber("Hi there what do you want to do? Type the number of the action you want to do:\n1. check-in\n2. check-out.\n 3. see your status\n4. stop");
        switch (choiceAtReception) {
            case 1:
                checkIn();
                break;
            case 2:
                checkOut();
                break;
            case 3:
                status();
                break;
            case 4:
                stop();
                break;
            default:
                System.out.println("you made a wrong choice so I will stop you and you can start over.");
        }
    }

    @Override
    public void checkIn() {
        int numberOfGuest = DifferentScanners.askForNumber("How many people do you want to check in?");
        checkInGuests(numberOfGuest); //errorhandling is bij deze scanner
    }

    @Override
    public void checkOut() { //omgekeerde versie van checkin heb ik nog niet gemaakt.

    }

    @Override
    public void status() { //zit volgens mij incheckin.

    }

    @Override
    public void stop() {
        System.out.println("Bye");
    }
}
