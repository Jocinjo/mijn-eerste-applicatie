
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog doet.
public class Main{
    public static void main(String[] args) {
       Bank bank = new Bank();
       bank.createAccount("NL01ABCD1234567890", 1000.00);
       bank.createAccount("NL02EFGH1234567890", 500.00);
       bank.deposit("NL01ABCD1234567890", 250.00);
       bank.withdraw("NL02EFGH1234567890", 20001.00);
       bank.getAccount("NL01ABCD1234567890");
       bank.getBalance("NL01ABCD1234567890");
       bank.deposit("NL01ABCD1234567890", 250.00);
       bank.getBalance("NL01ABCD1234567890");
       bank.getBalance("NL02EFGH1234567890");



//        Test_hashMap jo = new Test_hashMap();


    }
}

