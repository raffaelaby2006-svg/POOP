package Pertemuan2.prakatikum;

public class main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0821-0000-0001");
        SavingsAccont acc1 = new SavingsAccont("A001", customer1, 500000, 0.01 );
        acc1.withdraw(150000);
        acc1.printInfo();   
        acc1.printAccountType();
    }
}
