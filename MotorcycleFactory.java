package vehicle.factory;

import vehicle.Motorcycle;
import vehicle.Truck;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Truck createVehicle() {
        return new Motorcycle(); // Correct implementation matching the abstract method
    }
}
