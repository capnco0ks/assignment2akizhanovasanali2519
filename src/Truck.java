public class Truck extends Vehicle {
    private double capacity;
    private int maxAxles;

    public Truck(String brand, int year, double capacity, int maxAxles){
        super(brand,year);
        this.capacity = capacity;
        this.maxAxles = maxAxles;

    }
    @Override
    public void StartEngine() {
        System.out.println("Truck engine started.Capacity: "+capacity+" tons.");
    }

    @Override
    public void StopEngine() {
        System.out.println("Motorycle engine stopped");
    }
}

