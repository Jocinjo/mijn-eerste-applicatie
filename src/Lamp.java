public class Lamp {
    public String status;
    public boolean isAan;

    public Lamp(String status) {
        this.status = status;
        if (status.equals("aan")) {
            aan();
        }
        else if (status.equals("uit")) {
            uit();
        }
        else {
            System.out.println("Dit keywoord herken ik niet.");
        }
    }
    public void aan() {
        System.out.println("De lamps staat aan!");
        this.isAan = true;
    }

    public void uit() {
        System.out.println("De lamp staat uit!");
        this.isAan = false;

    }
}
