
/*
dag 6 met als doel:
 * zeggen hoeveel eieren er zijn per dag
 * gebruik van / en %. voor de modulus zou ik een ifstatement gebruiken.
 * er zijn 4 zussen.

 antwoord bij 6 eieren krijgt iedere zus een 1 en de duckbear 2.
 */


import java.util.Scanner;

public class Dag_6 {


    public Dag_6() {
    }
        public void divider() {
            Scanner input = new Scanner(System.in);
            System.out.println("How many eggs were laid today? ");
            int eggs = input.nextInt();
            int sisters = 4;
            int eggsPerSister = eggs / sisters;
            int leftOvers = eggs % sisters;
            if (leftOvers > 0) {
                System.out.println(eggsPerSister + " egg(s) is/are fot the sisters and " + leftOvers + " is/are for the duckbear.");
            }
            else {
                System.out.println(eggsPerSister + " egg(s) is/are going to each sister");
            }
    }
}
