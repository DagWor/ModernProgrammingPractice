package questionE;

public class SavingsAccount extends Account {
    private String accountId;
    private double interestRate;
    private double balance;

    public SavingsAccount(String accountId, double interestRate, double balance) {
        this.accountId = accountId;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    String getAccountId() {
        return accountId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
