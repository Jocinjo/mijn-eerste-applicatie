import java.util.Scanner;

public class Appartment implements Property{
    public Appartment(Scanner input) {
        this.input = input;
    }

    Scanner input = new Scanner(System.in);
    @Override
    public void price() {
        System.out.println("What is the price for the appartment? ");
        int appartmentPrice = input.nextInt();
        System.out.println("The appartment price is " + appartmentPrice);
        //eventueel gewoon zeggen dat de prijs 200.000 euro is
    }

    @Override
    public void address() {
        System.out.println("Whats your address? ");
        String yourAdress = input.nextLine();
        System.out.println("The adress is " + yourAdress);
    }

    @Override
    public void numberOfRooms() {
        System.out.println("How many rooms do you have? ");
        int amounfOfRooms = input.nextInt();
        if (amounfOfRooms < 2) {
            System.out.println("you don't have a appartment but a studio.");
        }else {
            System.out.println("you have a appartment with " + amounfOfRooms + " rooms.");
        }

    }

    @Override
    public void livingArea() {
        System.out.println("you have 50 square feet");

    }

    @Override
    public void totalArea() {
        System.out.println("in total there is 75 feet, this includes the garden.");
    }
}
