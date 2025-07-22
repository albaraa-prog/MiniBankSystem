public class SavingsAccount extends BankAccount {
    double interestRate;


    public void setSavingsAccount(String accName, String accNum, double bal, double rate) {
        set(accName, accNum, bal); // Call superclass method
        this.interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        if (interestRate > 0) {
            double interest = balance * (interestRate / 100);
            balance += interest;
            System.out.println("Interest of " + interest + " applied.");
            System.out.println("New Balance after interest: " + balance);
        } else {
            System.out.println("Invalid interest rate. Cannot apply interest.");
        }
    }
}
