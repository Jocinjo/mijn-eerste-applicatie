import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in);
    String accountNumber = input.next();
//    int beginsaldo = input.nextInt();
    double balance = input.nextDouble();
    double deposit = input.nextDouble();
    double withdraw = input.nextDouble();
    public Bank() {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    // onderstaande dadelijk nog verder aanvu;len maar eerst alle methodes even schrijven voor de zekerheid.
    public void createAccount(String accountNumber, double balance) {
        System.out.print("jouw rekeningnummer is: " + accountNumber + "en je beginbalance is: ");
        System.out.println(balance);
    }
    public void getAccount(String accountNumber) {
    }
    public void getAccountNumber() {}
    public void deposit() {}
    public void withdraw() {}
    public void getBalance() {}

}
