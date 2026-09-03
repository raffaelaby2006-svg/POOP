package Tugas;

public class Mobil {
    private String brand;
    private int cc;
    private int speed;
    private int gear=1;
    private double hp;
    private int [] GEAR_SPEED_LIMITS = {50,100,160,220,260,310,350,380};

    public void setBrand(String brandName){
        brand = brandName;
    }
    public void centiMeterCubic(int CC){
        cc = CC;
    }
    public void gearChanges(int gearValue){
        if(gearValue < 1 || gearValue > 8){
            System.out.println("Invalid, you must input be between 1 and 8");
        }else{
            gear = gearValue;
        }
    }
    public int speedAcceleration(int increment){
        speed += increment;
        if(speed>GEAR_SPEED_LIMITS[gear - 1]){
            speed = GEAR_SPEED_LIMITS[gear -1];
        }
        return speed;
    }
    public int speedDeceleration(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }
        return speed;
    }
    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("CC : " + cc);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}
