# HexSoftwares_Banking_System

A simple Java-based banking system that allows users to create accounts, deposit money, withdraw money, and check their balance. This project is designed to demonstrate basic object-oriented programming concepts, including classes, objects, and error handling.

## Features

1. **Bank Account Management**:
   - Create new bank accounts with unique account numbers.
   - Deposit money into accounts.
   - Withdraw money from accounts with sufficient balance.
   - Check the balance of any account.

2. **Customer Management**:
   - Each customer can have multiple accounts.

3. **Error Handling**:
   - Prevents invalid operations such as:
     - Depositing or withdrawing negative amounts.
     - Withdrawing more than the account balance.
     - Accessing non-existent accounts.

4. **Console-Based Menu**:
   - User-friendly menu for interacting with the system.

---

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- A terminal or command prompt for running Java applications.

### Steps to Run

1. Clone or download the repository to your local machine.

2. Navigate to the project directory and ensure the following files exist:
   - `BankAccount.java`
   - `Customer.java`
   - `Main.java`

3. Compile the Java files:
   ```bash
   javac Main.java
Run the program:
bash
Copy code
java Main
Usage
Once the program starts, follow the on-screen prompts:

Enter your name to create a customer profile.
Use the menu options to:
Create a New Account: Enter a unique account number and an initial deposit.
Deposit Money: Select an account and specify the deposit amount.
Withdraw Money: Select an account and specify the withdrawal amount (if funds are sufficient).
Check Balance: View the balance of any account.
Exit: Close the program.
Example Interaction
plaintext
Copy code
Welcome to the Simple Banking System!
Enter your name: John

Options:
1. Create a new account
2. Deposit money
3. Withdraw money
4. Check balance
5. Exit
Enter your choice: 1

Enter a new account number: 12345
Enter an initial deposit: 100.0
Account created successfully for John

Options:
1. Create a new account
2. Deposit money
3. Withdraw money
4. Check balance
5. Exit
Enter your choice: 2

Enter account number: 12345
Enter amount to deposit: 50
Successfully deposited $50.0

Options:
1. Create a new account
2. Deposit money
3. Withdraw money
4. Check balance
5. Exit
Enter your choice: 4

Enter account number: 12345
Current balance: $150.0
Project Structure
BankAccount: Represents individual bank accounts.
Customer: Manages multiple bank accounts for a single customer.
Main: Provides a menu-based interface for user interaction.
Possible Extensions
Add support for:

Interest calculations.
Account deletion.
Transaction history tracking.
Implement a graphical user interface (GUI) using Java Swing or JavaFX.

License:
This project is open-source and available for use under the MIT License.

Acknowledgments
This project was developed as an introduction to object-oriented programming in Java. If you encounter any issues or have suggestions, feel free to contribute!


You can copy and save this content as `README.md` in your project folder. Let me know if you'd like to tweak or add anything!
