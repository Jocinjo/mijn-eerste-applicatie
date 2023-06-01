// het programma markeert nu van links naar rechts en boven naar beneden. is niet helemaal de bedoeling van de opdracht.
public class Dag_8 {

    private int getallen;
    private int left;
    private int right;
    private int up;
    private int down;

    public Dag_8(int getallen) {
        this.getallen = getallen;
        this.left = getallen - 1;
        this.right = getallen + 1;
        this.up = getallen - 1;
        this.down = getallen + 1;
    }

    public void make() {
        for (int aantalh = 0; aantalh <= getallen; aantalh++) {
            for (int aantalv = 0; aantalv <= getallen; aantalv++) {
                if (aantalh == left && aantalv == up) {
                    System.out.print("[" + aantalh + "x," + aantalv + "] ");
                } else {
                    System.out.print("[" + aantalh + ", " + aantalv + "] ");
                }
            }
            System.out.println();
        }
    }


    }

