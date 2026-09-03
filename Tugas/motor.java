package Tugas;

public class motor {
    private String brand;
    private int speed;
    private int cc;
    private int width;

    public void setBrand(String brandName){
        brand = brandName;
    }
    public void speedAcceleration(int increment){
        speed += increment;
    }
    public void centiMeterCubic(int CC){
        cc = CC;
    }
    public void setTiredWidth(int setTiredWidth){
        width = setTiredWidth;
    }
    public void printInfo(){
        System.out.println("Brand : " + brand );
        System.out.println("top Speed : " + speed );
        System.out.println("CC : " + cc + "cc");
        System.out.println("lebar kendaraan : " + width + "mm");
    }
}
