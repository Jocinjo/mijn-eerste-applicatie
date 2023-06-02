/*
alles dat je kan delen door 3 moet fire printen
alles wat je kan delen door 5 moet electric printen
alles wat je kan delen door 3 én 5 print blast.
 */
public class Dag_13 {
    public Dag_13() {    }
    public void magicalCannon () {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(ANSI_GREEN + i + ": POTENT BLAST" + ANSI_RESET);
            } else if (i % 3 == 0) {
                System.out.println(ANSI_RED + i + ": Fire" + ANSI_RESET);
            } else if (i % 5 == 0) {
                System.out.println(ANSI_BLUE + i + ": Electric" + ANSI_RESET);
            } else {
                System.out.println(i + ": Normal" + ANSI_RESET);
            }
        }
    }
}

