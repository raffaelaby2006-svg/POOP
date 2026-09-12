package Pertemuan2.prakatikum;
public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private double dailyWithDrawLimit;

    public Account(String accountNumber, String ownerName, double balance, double dailyWithDrawLimit){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.dailyWithDrawLimit = dailyWithDrawLimit;
    }
    public String getAccountNumber(){
        return ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amount){
        if(amount <= 0){
            return false;
        }
        balance += amount;
        return true;
    }
    public boolean withdraw(double amount){
        if(amount <= 0 || amount > balance || amount > dailyWithDrawLimit){
            return false;
        }
        balance -= amount;
        return true;
    }
    public void printInfo(){
        System.out.println(accountNumber + "-" + ownerName + "- balance: " + balance );
    }
}

