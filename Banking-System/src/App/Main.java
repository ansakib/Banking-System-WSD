package App;

import Accounts.*;
import Bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Account newAccount = new CurrentAccount("Sakib", "1234567890", 1000);
        bank.addAccount(newAccount);
        newAccount.accountInfo();
    }
}
