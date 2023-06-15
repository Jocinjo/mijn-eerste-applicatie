public abstract class Kamer implements IKamer {
    private final Gast[] gasten;
    private final int grootte;

    public Kamer(int grootte) {
        this.grootte = grootte;
        this.gasten = new Gast[grootte];
    }

    public abstract String getKamerType(); // geeft aan wat voor soort kamer het is (een persoons, twee persoons, etc.)

    public abstract void checkInGuests(Gast[] guests) throws Exception; // checkt in een aantal gasten in de kamer

    public boolean isKamerBezet() {
        return gasten.length > 0;
    }
}