import java.util.Scanner;

/*
je moet kunnen aangeven hoeveel provinces, duchies en estates er zijn p.p.
dan alle scores optellen. 1 voor estate, 3 voor duchy en 6 voor province.
laat alle punten zien pp.
 */
public class Dag_7 {
    public Dag_7() {}
    public void totalPoints() {
        Scanner input = new Scanner(System.in);
        System.out.println("whats your name? ");
        System.out.println("how many estates do you have? ");
        System.out.println("how many duchies do you have? ");
        System.out.println("how many provinces do you have? ");
        String name = input.nextLine();
        int estate = input.nextInt();
        int duchy = input.nextInt();
        int province = input.nextInt();

        int pointsEstate = 1;
        int pointsDuchy = 3;
        int pointsProvince = 6;

        int pointsForSout = (estate * pointsEstate) + (duchy * pointsDuchy) + (province * pointsProvince);
        // misschien een hasmap maken zodat hij de punten onder elkaar kan laten zien. wacht is niet nodig maar 3 instanties aan en je ziet ze verschillend onder elkaar als je ze sout.
//        misschien toch een hasmap aanmaken omdat je ze nu niet onder elkaar ziet.

        System.out.println(name + ": " + pointsForSout);


    }


}
