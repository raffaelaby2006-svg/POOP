package Tugas;

public class MobilMain {
    public static void main(String[] args) {
        Mobil mobilSport1 = new Mobil();
        Mobil mobilSport2 = new Mobil();
        addInformation  mobilSport3 = new addInformation();

        mobilSport1.setBrand("BMW M2");
        mobilSport1.centiMeterCubic(3000);
        mobilSport1.gearChanges(7);
        mobilSport1.speedAcceleration(340);
        mobilSport1.printInfo();
        
        mobilSport2.setBrand("BMW M3");
        mobilSport2.centiMeterCubic(3000);
        mobilSport2.gearChanges(7);
        mobilSport2.speedAcceleration(350);
        mobilSport2.printInfo();

        mobilSport3.setBrand("Audi R8");
        mobilSport3.centiMeterCubic(5000);
        mobilSport3.gearChanges(8);
        mobilSport3.speedAcceleration(380);
        mobilSport3.setTiredWidth(22);
        mobilSport3.Hp(723.9);
        mobilSport3.printInfo();
    }
}
