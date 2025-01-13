import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void createAccount(String accountNumber, double initialBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created successfully for " + name);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}
