package Pertemuan2.prakatikum;

public class main {
    public static void main(String[] args) {
        Account from = new Account("Nadia", 500000);
        Account to = new Account("Budi", 200000);

        from.tranfersTo(to, 100000);

        from.printInfo();
        to.printInfo();
    }
}
