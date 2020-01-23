
package examplebankaccount;

public class Account {
    private Bank bank;
    private int accountID;
    private String accountName;
    private double balance;

    public Account(Bank bank, int accountID, String accountName, double balance) {
        this.bank=bank;
        this.accountID = accountID;
        this.accountName = accountName;
        this.balance = balance;
    }
    void withdraw(double amount){
        if(this.balance<amount){
            System.out.println("Not Enough money");
        }
        else{
            this.balance=this.balance-amount;
        }
    }
    
    void deposite(double amount){
        this.balance=this.balance+amount;
    }
    
    void transfer(Account account, double amount){
        if(this.balance>=amount){
            this.balance=this.balance-amount;
            account.balance=account.balance+amount;
        }
        else{
            System.out.println("Not Enough Money!");
        }
    }

    @Override
    public String toString() {
        return "Account{" + "bank=" + bank + ", accountID=" + accountID + ", accountName=" + accountName + ", balance=" + balance + '}';
    }

    
}
