public class BankAccount  {
    private int balance = 0;
    private boolean AccountActive;

    void open(){
        balance = 0;
        AccountActive = true;
    }

    int getBalance() throws BankAccountActionInvalidException{
        if (!AccountActive)
            throw new BankAccountActionInvalidException("Account closed");
        return balance;
    }
    
    synchronized void deposit(int amount) throws BankAccountActionInvalidException{
        if (!AccountActive)
            throw new BankAccountActionInvalidException("Account closed");
        if (amount < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        balance += amount;
        //throw new BankAccountActionInvalidException("deposit");
    }

    synchronized void withdraw(int withdraw) throws BankAccountActionInvalidException{
        if (!AccountActive)
            throw new BankAccountActionInvalidException("Account closed");
        if (balance==0)
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        if (withdraw > balance)
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        if (withdraw < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        balance = balance - withdraw;
       // throw new BankAccountActionInvalidException("withdraw");
    }
    void close(){
        if (AccountActive)
            AccountActive = false;
    }
}
