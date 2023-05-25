import java.util.Scanner;

public class Schaakbord {
    Scanner input = new Scanner(System.in);
    public String getal = input.next();
    public int getallen = Integer.parseInt(getal);
    public int horizontaal = 0;
    public int verticaal;
    public int aantalh;
    public int aantalv;

    public Schaakbord() {
        this.horizontaal = horizontaal;
        this.verticaal = verticaal;
        this.aantalh = aantalh;
        this.aantalv = aantalv;
        this.getallen = getallen;
    }
    public void make() {
        for (aantalh = 0; aantalh < getallen; aantalh++) {
            for (aantalv = 0; aantalv < getallen; aantalv++) {
                System.out.print("[" + aantalh + "," + aantalv + "] ");
            }
            System.out.println();
        }
    }
}
