package Tugas;

public class perangkatElektronik {
    private String brand;
    private String prosessor;
    private int ram;
    private int ssd;

    public void Brand(String merek){
        brand = merek;
    }
    public void cpu(String CPU){
        prosessor = CPU;
    }
    public void Memori(int memori){
        ram = memori;
    }
    public void penyimpanan(int storage){
        ssd = storage;
    }
    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("CPU : " + prosessor);
        System.out.println("RAM : " + ram + "GB");
        System.out.println("Storage : " + ssd + "GB");
    }
}
