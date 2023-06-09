
public class Dag_17 {
    static void tombOfAgolTheWise() {
        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }

    }
    static int myTombOfAgolTheWise(int k) {
        if (k > 0) {
            return k + myTombOfAgolTheWise(k - 1); //dit moet dezelfde naam zijn als de functienaam
        }else {
            return 0;}
    }
}
