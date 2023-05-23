public class Car {
    public String typeOfFuel = "diesel";
    public Car() {
    }
    public void drive() {
        System.out.println("De auto rijdt met " + typeOfFuel + ".");
    }
    public void brake() {
        System.out.println("De auto remt.");
    }
}
