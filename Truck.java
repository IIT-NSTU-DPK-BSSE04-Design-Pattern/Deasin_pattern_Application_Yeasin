package vehicle;

public class Truck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling a truck...");
        addBody();
        addWheels();
        addEngine();
        System.out.println("Truck assembly complete.");
    }

    @Override
    public void addBody() {
        System.out.println("Adding a larger truck body with cargo bed.");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding 6 truck wheels.");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding a stronger truck engine.");
    }
}

