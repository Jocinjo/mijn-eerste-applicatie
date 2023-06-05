public class Verpakking {
    private int lengte;
    private int breedte;
    private int hoogte;
    private boolean vloeistof;

    public Verpakking(int lengte, int breedte, int hoogte, boolean vloeistof) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.vloeistof = vloeistof;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
