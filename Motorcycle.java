package vehicle;

public class Motorcycle extends vehicle.Truck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling a motorcycle...");
        addBody();
        addWheels();
        addEngine();
        System.out.println("Motorcycle assembly complete.");
    }

    @Override
    public void addBody() {
        System.out.println("Adding a motorcycle frame.");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding 2 motorcycle wheels.");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding a motorcycle engine.");
    }
}
