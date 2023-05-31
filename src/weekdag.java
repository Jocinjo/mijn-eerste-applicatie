import java.util.Scanner;

// public weekdag();

public class weekdag {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String weekdag = input.next();
    System.out.println("welke dag van de week is het? ");
    int dagnummer;
    input.close();

    if (weekdag.equals("maandag")) {
        dagnummer = 0;
        System.out.println("het is maandag, dag: " + dagnummer);
    }
    else if (weekdag.equals("dinsdag")) {
        dagnummer = 1;
        System.out.println("het is dinsdag, dag: " + dagnummer);
    }
    else if (weekdag.equals("woensdag")) {
        dagnummer = 2;
        System.out.println("het is woensdag, dag: " + dagnummer);
    }
    else if (weekdag.equals("donderdag")) {
        dagnummer = 3;
        System.out.println("het is donderdag, dag: " + dagnummer);
    }
    else if (weekdag.equals("vrijdag")) {
        dagnummer = 4;
        System.out.println("het is vrijdag, dag: " + dagnummer);
    }
    else if (weekdag.equals("zaterdag")) {
        dagnummer = 5;
        System.out.println("het is zaterdag, dag: " + dagnummer);
    }
    else if (weekdag.equals("zondag")) {
        dagnummer = 6;
        System.out.println("het is zondag, dag: " + dagnummer);
    }
    else {
                System.out.println("dit is geen geldige dag!");
    }
    }

}
