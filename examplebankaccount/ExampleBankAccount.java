package examplebankaccount;
public class ExampleBankAccount {
    public static void main(String[] args) {
        Bank bank1=new Bank("Dhaka Bank", "Dhaka", 5);
        Account a1=new Account(bank1, 1, "Account 1", 1000);
        Account a2=new Account(bank1, 2, "Account 2", 5000);
        a2.transfer(a1, 500);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
    
}
