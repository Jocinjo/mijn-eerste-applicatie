//ik heb nu scanners gemaakt maar dat moet eigenlijk niet. de rest werkt waarschijnlijk al

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in);
    String accountNumber = input.next();
//    int beginsaldo = input.nextInt();
    double balance = input.nextDouble();
    double amount = input.nextDouble();
    HashMap<String, Double> Bankaccounts = new HashMap<String, Double>();

    public Bank() {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
        this.Bankaccounts = Bankaccounts;
    }

    // onderstaande dadelijk nog verder aanvu;len maar eerst alle methodes even schrijven voor de zekerheid.
    public void createAccount(String accountNumber, double balance) {
        System.out.print("jouw rekeningnummer is: " + accountNumber + "en je beginbalance is: ");
        System.out.println(balance);
        Bankaccounts.put(accountNumber, balance);

    }
    public void getAccount(String accountNumber) { //key laten printen.
//        System.out.println(Bankaccounts.containsValue(balance));
        System.out.println(Bankaccounts.get(accountNumber));
    }
    public void getAccountNumber() {

    }
    public void deposit(String accountNumber, double amount) {
        Bankaccounts.put(accountNumber, +amount);
    }
    public void withdraw(String accountNumber, double amount) {
        while (Bankaccounts.put(accountNumber, -amount)!=0) {
            Bankaccounts.put(accountNumber, -amount);
            if (Bankaccounts.put(accountNumber, -amount) <0) {
                break;
            }
        }
    }
    public void getBalance() {
        System.out.println(Bankaccounts.get(accountNumber));

    }

}
