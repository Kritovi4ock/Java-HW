import java.util.Arrays;
import java.util.List;

abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void startEngine();

    public void displayInfo() {
        System.out.println("Vehicle: " + name);
    }
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + ": Starting combustion engine");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car: " + name + " (Combustion Engine)");
    }
}

class ElectricCar extends Vehicle {
    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + ": Activating electric motor");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Electric Car: " + name + " (Electric Motor)");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + ": Starting motorcycle engine");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + name);
    }
}

class VehicleService {
    public void performMaintenance(Vehicle vehicle) {
        System.out.println("Performing maintenance on:");
        vehicle.displayInfo();
        System.out.println("Maintenance completed!");
        System.out.println("---");
    }
}

public class LSPDemo {
    public static void main(String[] args) {
        System.out.println("=== Liskov Substitution Principle Demo ===");

        Vehicle car = new Car("Toyota Camry");
        Vehicle electricCar = new ElectricCar("Tesla Model S");
        Vehicle motorcycle = new Motorcycle("Harley Davidson");

        List<Vehicle> vehicles = Arrays.asList(car, electricCar, motorcycle);
        
        System.out.println("\n1. Testing engine start (polymorphic behavior):");
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
        
        System.out.println("\n2. Testing vehicle information:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
        
        System.out.println("\n3. Testing with VehicleService (LSP in practice):");
        VehicleService service = new VehicleService();
        for (Vehicle vehicle : vehicles) {
            service.performMaintenance(vehicle);
        }
        
        System.out.println("\n4. Individual vehicle demonstrations:");
        demonstrateVehicle(car);
        demonstrateVehicle(electricCar);
        demonstrateVehicle(motorcycle);
    }

    static void demonstrateVehicle(Vehicle vehicle) {
        System.out.println("--- Demonstrating " + vehicle.getName() + " ---");
        vehicle.displayInfo();
        vehicle.startEngine();
        System.out.println("This vehicle correctly implements Vehicle contract!");
    }
}