public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    public Motorcycle(String brand, int year, boolean isHasSidecar){
        super(brand,year);
        this.hasSidecar= hasSidecar;

    }

    @Override
    public void StartEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void StopEngine() {
        System.out.println("Motorycle engine stopped");
    }
}
