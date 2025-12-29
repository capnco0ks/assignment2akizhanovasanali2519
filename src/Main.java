public class Main{
    public static void main(String[] args) {
        Driver driver1 = new Driver("Amir", "123AMI");
        Driver driver2 = new Driver("Bakytzhan", "111BAK");
        Driver driver3 = new Driver("Rustam", "001RUS");

        Vehicle car1 = new Car("Mercedes", 2008, 4, "Petrol");
        Vehicle car2 = new Car("BMW",2019,4,"Diesel");
        Vehicle motorcycle = new Motorcycle("Kawasaki",2010,false);
        Vehicle truck = new Truck("Volvo", 2002,10.5,6);

        car1.setDriver(driver1);
        car2.setDriver(driver2);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver3);

        Vehicle[] vehicles = {car1,car2,motorcycle,truck};

        for (Vehicle v : vehicles){
            v.StartEngine();
            v.displayInfo();
            v.displayDriverInfo();
            v.StopEngine();
            System.out.println("----------------");
        }
    }
}
