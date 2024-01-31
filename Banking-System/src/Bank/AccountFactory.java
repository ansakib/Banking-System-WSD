package Bank;

import Accounts.Account;
import Accounts.CurrentAccount;

// Factory pattern for creating accounts
public class AccountFactory {
    public static Account createAccount(String accountType, String name, String accountNumber, double initialDeposit) {
        if (accountType.toLowerCase().equals("current")) {
            return new CurrentAccount(name, accountNumber, initialDeposit);
        } else {
            return null;
        }
    }
}
