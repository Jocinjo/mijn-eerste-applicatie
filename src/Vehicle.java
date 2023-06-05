import java.util.Scanner;

class Vehicle { //is default waarde nu
    Scanner input = new Scanner(System.in);
    String dealerName;
    protected static int count;

    protected static String brand = "BMW"; // static is gebruikt deze veranderd namelijk nie

    public void honk() {
        System.out.println("Ik ga toeteren met mijn " + brand + "!");
    }

    protected String dealer() {
        this.dealerName = dealerName;
        System.out.println("who's your dealer?");
        dealerName = input.nextLine();
        return dealerName;
    }

    public static int countObjects() {
        return count++;
    }

    public static void general() {
        System.out.println("I am a vehicle!");
    }
}

