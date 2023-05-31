public class Booleanhuiswerk {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = true;
        boolean C = false;
        boolean D = true;
        boolean question1 = B||C;
        boolean question2 = A && B||C;
        boolean question3 = A && B || C && D;
        System.out.println(question1);     
        System.out.println(question2);     
        System.out.println(question3);  
        System.out.println(question1 + " " + question2 + " " + question3);     
   

    }
   
}
