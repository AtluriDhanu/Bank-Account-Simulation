package bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account userAccount = new Account();
        int choice;

        do {
            System.out.println("\n******** Bank Account Menu ********");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Show Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            System.out.println("----------------------------------");  

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    userAccount.deposit(depositAmt);
                    System.out.println("**********************************");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    userAccount.withdraw(withdrawAmt);
                    System.out.println("**********************************");
                    break;

                case 3:
                    userAccount.showBalance();
                    System.out.println("----------------------------------");
                    break;

                case 4:
                    userAccount.showTransactions();
                    System.out.println("----------------------------------");
                    break;

                case 5:
                    System.out.println("**** Thank you for using the bank application. ****");
                    System.out.println("----------------------------------");
                    break;

                default:
                    System.out.println("**** Invalid choice! Please try again. ****");
            }

            System.out.println();  
        } 
        while (choice != 5);
    }
}
