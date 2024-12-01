package vehicle.factory;

import vehicle.Motorcycle;
import vehicle.Truck;

public class CarFactory extends VehicleFactory {
    @Override
    public Truck createVehicle() {
        return new Motorcycle();
    }
}
