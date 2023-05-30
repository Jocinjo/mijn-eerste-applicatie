public class BankAccount {
    public void accountSettings(Bank bank) {
        bank.allAccounts();
    }
    public String accountInString(Bank bank) {
        return bank.toString();

    }
    public void printAllAccountsInStrings(Bank bank) {
        bank.printString();
        System.out.println("Dit is de versie van de bankaccountklasse");
    }
}
