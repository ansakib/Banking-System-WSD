package App;

import Accounts.*;
import Bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        bank.addAccount("current", "Sakib", "1234567890", 1000);
        bank.addAccount("current", "Rakib", "0987654321", 2000);
        bank.addAccount("savings", "Rahim", "1234509876", 3000);
        bank.addAccount("salary", "Karim", "6789054321", 4000);
        bank.displayAccounts();
    }
}
