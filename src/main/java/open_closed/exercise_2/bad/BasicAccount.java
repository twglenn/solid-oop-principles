package open_closed.exercise_2.bad;

import java.util.UUID;

public class BasicAccount {

    private static final double WITHDRAW_FEE = 0.1;
    private static final double TRANSFER_FEE = 1.5;
    private final UUID accountId;
    private double balance;

    public BasicAccount(double balance) {
        this.balance = balance;
        accountId = UUID.randomUUID();
    }

    public UUID getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

    public double transfer(double amount, BasicAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, CheckingAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, MonthlyInterestAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, YearlyInterestAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }
}
