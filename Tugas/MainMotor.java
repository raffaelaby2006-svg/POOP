package Tugas;

public class MainMotor {
    public static void main(String[] args) {
        
        motor motorMatic1 = new motor();

        motorMatic1.setBrand("Honda");
        motorMatic1.speedAcceleration(130);
        motorMatic1.centiMeterCubic(147);
        motorMatic1.setTiredWidth(50);
        motorMatic1.printInfo();
    }
}
