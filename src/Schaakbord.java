import java.util.Scanner;

public class Schaakbord {
    Scanner input = new Scanner(System.in);
    public String getal = input.next();
    public int getallen = Integer.parseInt(getal);
    public int horizontaal = 0;
    public int verticaal;
    public int aantalh;
    public int aantalv;

    public Schaakbord(int horizontaal, int verticaal) {
        this.horizontaal = horizontaal;
        this.verticaal = verticaal;
        this.aantalh = aantalh;
        this.aantalv = aantalv;
        this.getallen = getallen;
    }
    public void make() {
        for (aantalh = 0; aantalh < horizontaal; aantalh++) {
            for (aantalv = 0; aantalv < verticaal; aantalv++) {
                System.out.print("[" + aantalh + "," + aantalv + "] ");
            }
            System.out.println();
        }
    }
}
