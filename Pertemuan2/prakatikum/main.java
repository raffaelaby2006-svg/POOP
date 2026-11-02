package Pertemuan2.prakatikum;

public class Main {
    public static void main(String[] args) {
        Customer customer= new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer, 100000, 0.02);
        
        try {
            savings.withdraw(70000);
        }catch(InsufficientBalanceException e){
            System.out.println("Withdraw failed: " + e.getMessage());
        }

        try{
            savings.withdraw(30000);
            System.out.println("Withdrawl succeeded, new balance: " + savings.getBalance());
        }catch(InsufficientBalanceException e) {
            System.out.println("Withdrawl failed : " + e.getMessage());
        }
    }   
}
