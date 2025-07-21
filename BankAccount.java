import java.awt.*;

public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public void set(String aN, String aNum, double bal){
        accountName = aN;
        accountNumber = aNum;
        balance = bal;
    }

    public String getAccountName(){
        return accountName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void showAccountInfo(){
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: " + getBalance());
    }
}
