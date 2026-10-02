package Pertemuan2.prakatikum;

public class CheckingAccount extends Account {
    private double overdraftLimit;
    
    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit){
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){
        return getOverdraftLimit();
    }
    public void printAccountType(){
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }
}
