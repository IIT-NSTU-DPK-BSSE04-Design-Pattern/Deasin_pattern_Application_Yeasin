package vehicle;

public class Car implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling a car...");
        addBody();
        addWheels();
        addEngine();
        System.out.println("Car assembly complete.");
    }

    @Override
    public void addBody() {
        System.out.println("Adding a car body.");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding 4 car wheels.");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding a car engine.");
    }
}
