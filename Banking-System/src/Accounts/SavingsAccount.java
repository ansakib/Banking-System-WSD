package Accounts;

import java.util.Date;

public class SavingsAccount implements Account {
    private String name, accountNumber;
    private Date dateCreated;
    private double balance, minmToCreate, minmToMaintain;

    public SavingsAccount(String name, String accountNumber, double initialDeposit) {
        setMinmToCreate(500);
        setMinmToMaintain(500);
        if (initialDeposit >= getMinmToCreate()) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.dateCreated = new Date();
            this.balance = initialDeposit;
        } else {
            System.out.println("Initial deposit must be at least " + getMinmToCreate());
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= getMinmToMaintain()) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Amount must be greater than 0!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void updateAccount(String name) {
        this.name = name;
    }

    @Override
    public void accountInfo() {
        System.out.println("Savings Account: " + name + "-" + accountNumber + ", Balance: " + balance);
    }

    private void setMinmToCreate(double minmToCreate) {
        this.minmToCreate = minmToCreate;
    }
    private double getMinmToCreate() {
        return minmToCreate;
    }

    private void setMinmToMaintain(double minmToMaintain) {
        this.minmToMaintain = minmToMaintain;
    }
    private double getMinmToMaintain() {
        return minmToMaintain;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
