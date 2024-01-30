package Accounts;

import java.util.Date;

public class CurrentAccount implements Account {
    private String name, accountNumber;
    private Date dateCreated;
    private double balance, minmToCreate, minmToMaintain;

    public CurrentAccount(String name, String accountNumber, double initialDeposit) {
        setMinmToCreate(1000);
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
}
