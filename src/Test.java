public class Test {
    public int hoeveelheid_testen = 0;
    public int totaal_aantal = hoeveelheid_testen++;
    public Test() {}
    public void pogingen() {
        System.out.print("het aantal keren dat ik geprobeerd heb is: ");
        System.out.println(totaal_aantal);
    }
}
