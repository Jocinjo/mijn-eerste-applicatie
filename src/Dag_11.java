import java.util.Scanner;

/*
challenge 1 van dag 11.
laat het menu zien en de cijfers ervoor.
vraag om een cijfer voor het menu
gebruik switch om te laten zien welke item het is en wat het kost.

deel 2. geef korting als de name hetzelfde is.
 */
public class Dag_11 {
    public Dag_11() {
    }

    public void items() {
        Scanner input = new Scanner(System.in);
        int priceRope = 10;
        int priceTorches = 15;
        int priceClimbingEquipment = 25;
        int priceCleanWater = 1;
        int priceMachete = 20;
        int priceCanoe = 200;
        int priceFoodSupplies = 1;
        double division = 2;

        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("The following items are available:\n1. Rope\n2. Torches\n3. Climbing Equipment\n4. Clean Water\n5. Machete\n6. Canoe\n7. Food Supplies\nPlease make a choice by entering a number: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Rope and the price is: " + (priceRope / division));
                    break;
                } else {
                    System.out.println("You've chosen the Rope and the price is: " + priceRope);
                    break;
                }
            case 2:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Torches and the price is: " + (priceTorches / division));
                    break;
                } else {
                    System.out.println("You've chosen the Torches and the price is: " + priceTorches);
                    break;
                }
            case 3:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Climbing Equipment and the price is: " + (priceClimbingEquipment / division));
                    break;
                } else {
                    System.out.println("You've chosen the Climbing Equipment and the price is: " + priceClimbingEquipment);
                    break;
                }
            case 4:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Clean Water and the price is: " + (priceCleanWater / division));
                    break;
                } else {
                    System.out.println("You've chosen the Clean Water and the price is: " + priceCleanWater);
                    break;
                }
            case 5:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Machete and the price is: " + (priceMachete / division));
                    break;
                } else {
                    System.out.println("You've chosen the Machete and the price is: " + priceMachete);
                    break;
                }
            case 6:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Canoe and the price is: " + (priceCanoe / division));
                    break;
                } else {
                    System.out.println("You've chosen the Canoe and the price is: " + priceCanoe);
                    break;
                }
            case 7:
                if (name.equals("user")) {
                    System.out.println("You've chosen the Food Supplies and the price is: " + (priceFoodSupplies / division));
                    break;
                } else {
                    System.out.println("You've chosen the Food Supplies and the price is: " + priceFoodSupplies);
                    break;
                }
        }

    }
}
