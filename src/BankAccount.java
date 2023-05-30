public class BankAccount {
    private String accountNummer;
    public double balance = 0;
    public void accountSettings(Bank bank) {
        bank.allAccounts();
    }

    public BankAccount(String accountNummer){
        this.accountNummer = accountNummer;
    }

    public String getAccountNumber(){
        return this.accountNummer;
    }

    public String accountInString(Bank bank) {
        return bank.toString();
        // bovenstaande is nutteloos maar zonder deze methode kan ik niet print all account is strings doen.

    }

    public void getAccountNumber(double balance) {
        // moet het rekeningnummer terug geven.
        ;
        System.out.println();
    }
    public void printAllAccountsInStrings(Bank bank) {
        bank.printString();
        System.out.println("Dit is de versie van de bankaccountklasse");
    }

}
