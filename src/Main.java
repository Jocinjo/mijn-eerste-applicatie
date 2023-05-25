import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog doet
public class Main{
    public static void main(String[] args) {
//       Bank bank = new Bank();
//       bank.createAccount("NL01ABCD1234567890", 100.00);
//       bank.createAccount("NL02EFGH1234567890", 500.00);
//       bank.deposit("NL01ABCD1234567890", 250.00);
//       bank.withdraw("NL02EFGH1234567890", 200.00);
//       bank.getAccount("NL01ABCD1234567890");
//        Schaakbord s = new Schaakbord();
//                s.make();
        Lamp een = new Lamp("aan");
        Lamp twee = new Lamp("uit");
        Lamp drie = new Lamp("wat");
        System.out.println(twee.isAan);
        drie.status = "uit";
        System.out.println(drie.status);

    }
}

