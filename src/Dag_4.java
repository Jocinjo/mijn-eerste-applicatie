public class Dag_4 {
    // using 8 datatypes.
//    using the literal of the correct types.
//    and using the text type
    public byte by = 127;
    public short sho = 32767;
    public int anInt = 2000000000; // er mogen 9 cijfers achter de eerste dus miljard.
    public long aLong = 9L; // als het goed is mogen hier 18 cijfers achter kunnen. blijkbaar moet er een L achter.
    public float aFloat = 1F; //hier moet je een F achter zetten blijkbaar.
    public double aDouble = 1.66667; // tot 15 cijfers achter de komma
    public boolean aBoolean = true;
    public char aChar = 'k'; // enkele aanhalingstekens
    public String aString = "Josie";

    public Dag_4() {
        this.by = by;
        this.sho = sho;
        this.anInt = anInt;
        this.aLong = aLong;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
        this.aBoolean = aBoolean;
        this.aChar = aChar;
        this.aString = aString;
    }


        public void probeer() {
            System.out.println(by);
            System.out.println(sho);
            System.out.println(anInt);
            System.out.println(aLong);
            System.out.println(aFloat);
            System.out.println(aDouble);
            System.out.println(aBoolean);
            System.out.println(aChar);
            System.out.println(aString);
        }
    }

