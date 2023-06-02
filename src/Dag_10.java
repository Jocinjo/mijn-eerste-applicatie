/*
x positive = east
x negative = west
y positive is north
y negative is south
 */
public class Dag_10 {
    public Dag_10() {}
    public void watchtower(int x, int y) {
        if(x < 0 && y < 0) {
             System.out.println("The enemy is southwest!");
        } else if (x < 0 && y > 0) {
            System.out.println("The enemy is nortwest!");
        } else if (x > 0 && y < 0) {
            System.out.println("The enemy is southeast!");
        } else if (x > 0 && y > 0) {
            System.out.println("The enemy is northeast!");
        }
        else {
            System.out.println("The enemy is here!");
        }
    }
}
