package Bank;

import Accounts.*;

// Factory pattern for creating accounts
public class AccountFactory {
    public static Account createAccount(String accountType, String name, String accountNumber, double initialDeposit) {
        Account newAccount = null;
        if (accountType.toLowerCase().equals("current")) {
            newAccount =  new CurrentAccount(name, accountNumber, initialDeposit);
        } else if(accountType.toLowerCase().equals("savings")) {
            newAccount =  new SavingsAccount(name, accountNumber, initialDeposit);
        } else if(accountType.toLowerCase().equals("salary")) {
            newAccount = new SalaryAccount(name, accountNumber, initialDeposit);
        }

        if(newAccount.getAccountNumber() == null) {
            return null;
        }
        return newAccount;
    }
}
