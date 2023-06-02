/*
alles dat je kan delen door 3 moet fire printen
alles wat je kan delen door 5 moet electric printen
alles wat je kan delen door 3 én 5 print blast.
 */
public class Dag_13 {
    public Dag_13() {    }
    public void magicalCannon () {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + ": POTENT BLAST");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fire");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Electric");
            } else {
                System.out.println(i + ": Normal");
            }
        }
    }
}

