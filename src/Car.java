public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand ,int year ,int doors, String fuelType){
        this.doors = doors;
        this.fuelType = fuelType;
        super(brand,year);
    }

    @Override
    public void StartEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void StopEngine() {
        System.out.println("Engine stopped");
    }


}
