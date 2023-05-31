import java.util.Scanner;

/* construct a sentence using:
 * a as the name of the thing
 * b as the discription of the thing. this discription can be one word.
 * 
 * the bug was that the scanner wasn't imported yet. 
 * 
 * to make the code more understandable i would use comments likt the assignment asks, but i also would cut the last Sout in pieces on different lines.
 * lastly the off is double in the last printstatement. 
 */

public class Dag_3{
    public static void main(String[] args) {

    System.out.println("What kind of thing are we talking about?");
    Scanner input = new Scanner(System.in); // give it a name
    String a = input.next();
    System.out.println("How would you describe it? Big? Azure? Tattered?"); // give a description
    String b = input.next();
    String c = "of Doom";
    String d = "3000";
    System.out.println("The " + b + " " + a + " of " + c + " " + d + "!"); // the of is double but i will keep it in here for practising-purposes.
        input.close(); // can't remember why i have the input.close.
} 
}