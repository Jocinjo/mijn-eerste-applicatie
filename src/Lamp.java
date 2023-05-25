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
        if (!this.isAan) {
            System.out.println("De lamps staat aan!");
            this.isAan = true;
        }
        else {
            System.out.println("staat al aan");
        }
    }

    public void uit() {
        if(this.isAan) {
            System.out.println("De lamp staat uit!");
            this.isAan = false;
        }
        else {
            System.out.println("staat al uit");
        }

    }
}
