import java.util.Scanner;

public class MiniBankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        SavingsAccount sa = new SavingsAccount();
        int choice;

        do {
            System.out.println("\n====== Mini Bank System Menu ======");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Create a savings account");
            System.out.println("6. Apply interest to savings account");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(">> Creating a new regular account...\n");

                    System.out.print("Enter Account Name: ");
                    String accName = sc.next();

                    System.out.print("Enter Account Number: ");
                    String accNum = sc.next();

                    System.out.print("Enter Initial Balance: ");
                    double accbal = sc.nextDouble();

                    ba.set(accName, accNum, accbal);
                    System.out.println("\nRegular account created successfully!");
                    break;

                case 2:
                    System.out.println(">> Depositing money...");
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    ba.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println(">> Withdrawing money...");
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    ba.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println(">> Viewing account details...");
                    ba.showAccountInfo();
                    break;

                case 5:
                    System.out.println(">> Creating a new savings account...\n");

                    System.out.print("Enter Account Name: ");
                    String sAccName = sc.next();

                    System.out.print("Enter Account Number: ");
                    String sAccNum = sc.next();

                    System.out.print("Enter Initial Balance: ");
                    double sAccBal = sc.nextDouble();

                    System.out.print("Enter Interest Rate (%): ");
                    double sInterestRate = sc.nextDouble();

                    sa.setSavingsAccount(sAccName, sAccNum, sAccBal, sInterestRate);
                    System.out.println("\nSavings account created successfully!");
                    break;

                case 6:
                    System.out.println(">> Applying interest to savings account...");
                    sa.applyInterest();
                    break;

                case 7:
                    System.out.println(">> Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }

        } while (choice != 7);

        sc.close();
    }
}
