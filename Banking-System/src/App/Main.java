package App;

import Accounts.*;
import Bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        bank.addAccount("current", "John Doe", "1234567890", 1000);

    }
}
