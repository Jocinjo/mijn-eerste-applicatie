// het programma markeert nu van links naar rechts en boven naar beneden. is niet helemaal de bedoeling van de opdracht.
public class Dag_8 {
    private int x;
    private int y;


    public Dag_8(int y, int x) {
        this.x = x;
        this.y = y;

        }
        public void setX(int x) {
        this.x = x;
        }

        public void setY(int y) {
        this.y = y;
        }
        public int getX() {
        return x;
        }
        public int getY() {
        return y;
        }

        public void positie() {
        int y  = getY();
        int x = getX();
            System.out.println("\u001B[31m" + (y-1) + " " + x);
            System.out.println((y+1) + " " + x);
            System.out.println((y) + " " + (x-1));
            System.out.println((y) + " " + (x+1) + "\u001B[0m");
        }
    }



