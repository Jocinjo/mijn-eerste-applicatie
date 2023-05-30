public class Student extends Persoon {

//    public String naam;

    public Student (String naam) {
        this.naam= naam;
        System.out.println("welkom " + this.naam);
    }

    @Override
    public String getNaam() {
        return "Hello "+ this.naam;
    }
    public void spreek() {
        System.out.println("ik ben een student");
        super.spreek();
    }
}
