import java.util.Scanner;
/*
ik kan geen kleuren geven voor nu omdat het niet kan in intellij. dus ik ga er X'en bij zetten als het kan.
 */
public class Dag_8 {

    Scanner input = new Scanner(System.in);
    public String getal = input.next();
    public int getallen = Integer.parseInt(getal);
    public int horizontaal = 0;
    public int verticaal;
    public int aantalh;
    public int aantalv;


    public Dag_8() {
        this.horizontaal = horizontaal;
        this.verticaal = verticaal;
        this.aantalh = aantalh;
        this.aantalv = aantalv;
        this.getallen = getallen;

    }
//misschien 4 verschillende variabelen maken dus links recht boven onver en dan die aan elkaar plakken of zo.
    public void make() {
        for (aantalh = 0; aantalh < getallen; aantalh++) {
            for (aantalv = 0; aantalv < getallen; aantalv++) {
                System.out.print("[" + aantalh + "," + aantalv + "] ");
                //misschien een extra forloop om te printen welke cijfers ++ en -- zijn
                if(aantalh -= 1 getallen) {
                    System.out.println("[" + aantalh + "," + aantalv + "]");
                }
                System.out.println();
                System.out.println((aantalh-- + "x") + (aantalh + "x") + (aantalh++ + "x") + " " + (aantalv-- + "x") + (aantalv + "x") + (aantalv++ + "x"));
            }
        }
    }
}


