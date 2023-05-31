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
    public int left = aantalh - 1;
    public int right = aantalh + 1;
    public int up = aantalv - 1;
    public int down = aantalv + 1;


    public Dag_8() {
        this.horizontaal = horizontaal;
        this.verticaal = verticaal;
        this.aantalh = aantalh;
        this.aantalv = aantalv;
        this.getallen = getallen;
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;


    }

    //misschien 4 verschillende variabelen maken dus links recht boven onver en dan die aan elkaar plakken of zo.
    public void make() {
        for (aantalh = 0; aantalh <= getallen; aantalh++) {
            for (aantalv = 0; aantalv <= getallen; aantalv++) {
                if (aantalh == left) {
                    System.out.println("[" + aantalh + "x," + aantalv + "]");
                } else {
                    System.out.print("[" + aantalh + "," + aantalv + "] ");
                }

//                misschien een extra forloop om te printen welke cijfers ++ en -- zijn

            }
            System.out.println();
        }
    }
}


// matches()
//contentEquals()
//contains
//replace() --> deze proberen.
//split()