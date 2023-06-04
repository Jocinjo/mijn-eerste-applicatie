import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
maak een array van 5
vraag voor 5 nummers bij de array en stop deze erin met put.
maak een tweede array van 5 elementen
copy the array met een forloop in de tweede array
laat beide arrays zien met print.
 */
public class Dag_14 {
    Integer[] firstArr = new Integer[5]; //blijkbaar kan de array niet in de method.
    Integer[] secondArr = new Integer[5];

    public Dag_14() {

    }



    public void dTo() {
        this.firstArr = firstArr;
        this.secondArr = secondArr;


        Scanner input = new Scanner(System.in);

        System.out.println("Please give the first number: ");
        int firstNum = input.nextInt();
        System.out.println("Please give the second number: ");
        int secondNum = input.nextInt();
        System.out.println("Please give the third number: ");
        int thirdNum = input.nextInt();
        System.out.println("Please give the fourth number: ");
        int fourthNum = input.nextInt();
        System.out.println("Please give the fifth number: ");
        int fifthNum = input.nextInt();

        firstArr[0] = firstNum;
        firstArr[1] = secondNum;
        firstArr[2] = thirdNum;
        firstArr[3] = fourthNum;
        firstArr[4] = fifthNum;

        System.out.println("The first array is: ");
        for (int i = 0; i < firstArr.length; i++) {
            System.out.println(firstArr[i]);
        }

    }

    public void displayAll() {
        this.firstArr = firstArr;
        this.secondArr = secondArr;
        System.out.println("The first array is: ");
        for (int i = 0; i < firstArr.length; i++) {
            System.out.println(firstArr[i]);
        }

        for (int i = 0; i < firstArr.length; i++) {
            secondArr[i] = firstArr[i];
        }
        System.out.println("The second array is: ");
        for (int i = 0; i < secondArr.length; i++) {
            System.out.println(secondArr[i]);
        }



    }

}
