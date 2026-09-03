public class mainBike {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike RoadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();
        
        RoadBike1.setBrand("Specialized");
        RoadBike1.setTiredWidth(25);
        RoadBike1.speedAcceleration(15);
        RoadBike1.gearChanges(4);
        RoadBike1.printInfo();
    }
}
