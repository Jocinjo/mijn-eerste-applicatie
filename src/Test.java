public class Test {
    public static int hoeveelheid_testen = 0;
    public int totaal_aantal = hoeveelheid_testen++;
    public Test() {
        ++hoeveelheid_testen;
    }
    public void pogingen() {
        System.out.print("het aantal keren dat ik geprobeerd heb is: ");
        System.out.println(totaal_aantal);
    }
}
