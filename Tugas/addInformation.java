package Tugas;

public class addInformation extends Mobil{
    private int tireWidth;
    private double HorsePower;
    private String jenis;

    public void setTiredWidth(int width){
        tireWidth = width;
    }
    public void Hp(double hp){
        HorsePower = hp;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width: " + tireWidth + "mm");
        System.out.println("Horse Powers : " + HorsePower + "hp");
    }
}
