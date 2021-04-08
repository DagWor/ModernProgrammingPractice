package questionE;

public class CheckingAccount extends Account {
    private String accountId;
    private double monthlyFee;
    private double balance;

    public CheckingAccount(String accountId, double monthlyFee, double balance) {
        this.accountId = accountId;
        this.monthlyFee = monthlyFee;
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
        return balance - monthlyFee;
    }
}
