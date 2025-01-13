import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Banking System!");

        // Create a new customer
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

        boolean running = true;

        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a new account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter an initial deposit: ");
                    double initialBalance = scanner.nextDouble();
                    customer.createAccount(accountNumber, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    BankAccount depositAccount = customer.getAccount(accountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    BankAccount withdrawAccount = customer.getAccount(accountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    BankAccount balanceAccount = customer.getAccount(accountNumber);
                    if (balanceAccount != null) {
                        System.out.println("Current balance: $" + balanceAccount.getBalance());
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Thank you for using the banking system!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
