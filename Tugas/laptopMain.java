package Tugas;

public class laptopMain {
    public static void main(String[] args) {
        perangkatElektronik laptopGaming1 = new perangkatElektronik();
        handphone handphone1 = new handphone();

        laptopGaming1.Brand("asus");
        laptopGaming1.Memori(16);
        laptopGaming1.cpu("intel Core");
        laptopGaming1.penyimpanan(512);
        laptopGaming1.printInfo();

        handphone1.Brand("Samsung ");
        handphone1.Memori(12);
        handphone1.cpu("Exynos");
        handphone1.penyimpanan(256);
        handphone1.tahunRilis(2025);
        handphone1.printInfo();
    }
}
