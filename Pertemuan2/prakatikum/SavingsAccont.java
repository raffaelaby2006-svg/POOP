package Pertemuan2.prakatikum;

public class SavingsAccont extends Account{
    private double interestRate;

    public SavingsAccont(String accountNumber, Customer owner, double balance, double interestRate){
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void printAccountType(){
        System.out.println("Account type: Savings, interest rate:" + interestRate) ;
    }
}
