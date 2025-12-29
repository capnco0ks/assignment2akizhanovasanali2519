public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;


    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public abstract void StartEngine();
    public abstract void StopEngine();

    public void displayInfo(){
        System.out.println("Brand: "+brand+", year is "+year);
    }

    public void displayDriverInfo(){
        if (driver != null){
            driver.DisplayDriverInfo();
        }
        else{
            System.out.println("No drivers of this car");
        }
    }
}