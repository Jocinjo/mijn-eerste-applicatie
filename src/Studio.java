import java.util.Scanner;

public class Studio extends Appartment{
    public Studio(Scanner input) {
        super(input);
    }

    public void numberOfRooms() {
        System.out.println("How many rooms do you have? ");
        int amounfOfRooms = 1;
            System.out.println("you have a appartment with " + amounfOfRooms + " rooms.");


    }
}
