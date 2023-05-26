//ik heb nu scanners gemaakt maar dat moet eigenlijk niet. de rest werkt waarschijnlijk al

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    //    Scanner input = new Scanner(System.in);
    String accountNumber;
    //    int beginsaldo = input.nextInt();
    double balance;
    double amount;
    HashMap<String, Double> Bankaccounts = new HashMap<String, Double>();

    public Bank() {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
        this.Bankaccounts = Bankaccounts;
    }

    // onderstaande dadelijk nog verder aanvu;len maar eerst alle methodes even schrijven voor de zekerheid.
    public void createAccount(String accountNumber, double balance) {
        // aanmaken van een account
        System.out.print("jouw rekeningnummer is: " + accountNumber + "en je beginbalance is: ");
        System.out.println(balance);
        Bankaccounts.put(accountNumber, balance);

    }

    public void getAccount(String accountNumber) { //key laten printen.
            System.out.println("accountNumber = " + accountNumber + "and balance is " + Bankaccounts.get(accountNumber));
    }

    public void getAccountNumber(double balance) {
        // moet het rekeningnummer terug geven.
//        System.out.println(Bankaccounts.containsValue(balance));
        }



    public void deposit(String accountNumber, double amount) {
        double currentBalance = Bankaccounts.get(accountNumber);
        double newBalance = currentBalance + amount;
        Bankaccounts.put(accountNumber, newBalance);

    }

    public void withdraw(String accountNumber, double amount) {


        double currentBalance = Bankaccounts.getOrDefault(accountNumber, 0.0);
        if (currentBalance >= amount) {
            double newBalance = currentBalance - amount;
            Bankaccounts.put(accountNumber, newBalance);
        } else {
            System.out.println("Insufficient balance for account: " + accountNumber);
        }

    }

    public Double getBalance(String accountNumber) {
        System.out.println(Bankaccounts.get(accountNumber));
        return balance;

    }

}
