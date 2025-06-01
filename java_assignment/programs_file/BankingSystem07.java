class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0.0;
    }

    public void displayUserInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.printf("Interest: $%.2f\n", calculateInterest());
        System.out.println("-----------------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

class FixedDepositAccount extends BankAccount {
    private double interestRate = 0.08; // 8%

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

public class BankingSystem07 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new SavingsAccount("SA001", 5000);
        accounts[1] = new FixedDepositAccount("FD001", 10000);
        accounts[2] = new SavingsAccount("SA002", 8000);

        System.out.println("--- Bank Account Interest Summary ---");
        for (BankAccount account : accounts) {
            account.displayUserInfo();
        }
    }
}
