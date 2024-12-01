package vehicle;

import vehicle.factory.VehicleFactory;

public class VehicleAssembler {
    public void assembleVehicle(VehicleFactory factory) {
        vehicle.Vehicle vehicle = (vehicle.Vehicle) factory.createVehicle();
        ((vehicle.Truck) vehicle).assemble();
    }

    public static void main(String[] args) {
        VehicleAssembler assembler = new VehicleAssembler();

        // Example usage
        VehicleFactory carFactory = new vehicle.factory.CarFactory();
        VehicleFactory truckFactory = new vehicle.factory.TruckFactory();
        VehicleFactory motorcycleFactory = new vehicle.factory.MotorcycleFactory();

        System.out.println("User ordered a car:");
        assembler.assembleVehicle(carFactory);

        System.out.println("\nUser ordered a truck:");
        assembler.assembleVehicle(truckFactory);

        System.out.println("\nUser ordered a motorcycle:");
        assembler.assembleVehicle(motorcycleFactory);
    }
}
