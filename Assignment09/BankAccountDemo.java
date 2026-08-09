public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SBI1023456789", "Krishna Sharma", 15000.0);
        acc.deposit(5000.0);
        acc.display();

        // acc.accountNumber = "SBI9999999999";
        // The line above would cause a compile-time error since accountNumber is final
    }
}

class BankAccount {
    final String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;   // assigned once, cannot be changed later
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : Rs." + balance);
    }
}
