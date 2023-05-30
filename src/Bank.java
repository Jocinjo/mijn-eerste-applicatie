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
        HashMap<String, BankAccount> Bankaccounts = new HashMap<String, BankAccount>();

        public Bank() {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.amount = amount;
            this.Bankaccounts = Bankaccounts;
        }

        // onderstaande dadelijk nog verder aanvu;len maar eerst alle methodes even schrijven voor de zekerheid.
        public void createAccount(String accountNumber, double bedrag) {
            BankAccount tijdelijk = new BankAccount(accountNumber);
            // aanmaken van een account
            System.out.print("jouw rekeningnummer is: " + accountNumber + "en je beginbalance is: ");
//            System.out.println(balance);
            Bankaccounts.put(accountNumber, tijdelijk);

        }

        public BankAccount getAccount(String accountNumber) { //key laten printen.
            return Bankaccounts.get(accountNumber);
        }




        public void deposit(String accountNumber, double amount) {
            BankAccount gevondenAccount = Bankaccounts.get(accountNumber);
            double balance = gevondenAccount.balance;
            double newBalance = balance + amount;
            gevondenAccount.balance = newBalance;
            Bankaccounts.put(accountNumber, gevondenAccount);
        }

        public void withdraw(String accountNumber, double amount) {
            BankAccount gevondenAccount = Bankaccounts.get(accountNumber);
                double newBalance = gevondenAccount.balance - amount;
                if(newBalance < 0){
                    System.out.println("te weinig geld");
                    return;
                }
                gevondenAccount.balance = newBalance;
                Bankaccounts.put(accountNumber, gevondenAccount);
        }

        public Double getBalance(String accountNumber) {
//            System.out.println(Bankaccounts.get(accountNumber));
            return balance;

        }

        public void allAccounts() {
            // de hele hashmap printen
            System.out.println(Bankaccounts);
        }

        public String toString() {
            String zoekobject = accountNumber;
//            double x = Bankaccounts.get(zoekobject);
//            return "Jouw rekeningnummer is " + accountNumber + "and your balance is " + (Double.toString(x));
            return Bankaccounts.toString();
        }
        public void printString() {
            System.out.println(Bankaccounts.toString());
        }

    }
