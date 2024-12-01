package vehicle.factory;

import vehicle.Truck;

public class TruckFactory extends VehicleFactory {
    @Override
    public Truck createVehicle() {
        return new Truck();
    }
}
