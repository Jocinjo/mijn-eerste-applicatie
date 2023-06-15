//ik heb nu scanners gemaakt maar dat moet eigenlijk niet. de rest werkt waarschijnlijk al

import java.util.HashMap;

    public class Bank {

        String accountNumber;
        double balance;
        double amount;
        HashMap<String, BankAccount> bankAccountHashMap = new HashMap<String, BankAccount>();

        public Bank() {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.amount = amount;
            this.bankAccountHashMap = bankAccountHashMap;
        }

        // onderstaande dadelijk nog verder aanvullen maar eerst alle methodes even schrijven voor de zekerheid.
        public void createAccount(String accountNumber, double bedrag) {
            BankAccount tijdelijk = new BankAccount(accountNumber);
            System.out.print("jouw rekeningnummer is: " + accountNumber + "en je beginbalance is: ");
            bankAccountHashMap.put(accountNumber, tijdelijk);

        }

        public BankAccount getAccount(String accountNumber) { //key laten printen.
            return bankAccountHashMap.get(accountNumber);
        }




        public void deposit(String accountNumber, double amount) {
            BankAccount gevondenAccount = bankAccountHashMap.get(accountNumber);
            double balance = gevondenAccount.balance;
            double newBalance = balance + amount;
            gevondenAccount.balance = newBalance;
            bankAccountHashMap.put(accountNumber, gevondenAccount);
        }

        public void withdraw(String accountNumber, double amount) {
            BankAccount gevondenAccount = bankAccountHashMap.get(accountNumber);
                double newBalance = gevondenAccount.balance - amount;
                if(newBalance < 0){
                    System.out.println("te weinig geld");
                    return;
                }
                gevondenAccount.balance = newBalance;
                bankAccountHashMap.put(accountNumber, gevondenAccount);
        }

        public Double getBalance(String accountNumber) {
            return balance;

        }

        public void allAccounts() {
            // de hele hashmap printen
            System.out.println(bankAccountHashMap);
        }

        public String toString() {
            String zoekobject = accountNumber;
            return bankAccountHashMap.toString();
        }
        public void printString() {
            System.out.println(bankAccountHashMap.toString());
        }

    }
