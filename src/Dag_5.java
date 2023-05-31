import java.util.Scanner;

public class Dag_5 {
   /*  deel 1 van dag 5 zit in dag 4 verwerkt omdat hij daarop voortbouwt.
    deel 2 van de dag 5 zal hier staan

    input voor base en heigt

    en uiteindelijk area = base x height / 2
    */



    public Dag_5() {


    }

    public void berekenDeArea() {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = (base*height)/2;
        System.out.print("the area is ");
        System.out.println(area);
    }
}
