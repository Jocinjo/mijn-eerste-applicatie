public class verwissel_variabelen {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;

        //suggestie
       int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

}
