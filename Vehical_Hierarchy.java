import java.util.Scanner;

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double calculateFuelEfficiency() {
        // Placeholder for actual implementation
        return 0.0;
    }

    double distanceTraveled(double fuel) {
        // Placeholder for actual implementation
        return 0.0;
    }

    double maximumSpeed() {
        // Placeholder for actual implementation
        return 0.0;
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        // Specific logic for Truck
        return 8.0; // Example value
    }

    @Override
    double distanceTraveled(double fuel) {
        return fuel * calculateFuelEfficiency();
    }

    @Override
    double maximumSpeed() {
        return 120.0; // Example value
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        // Specific logic for Car
        return 15.0; // Example value
    }

    @Override
    double distanceTraveled(double fuel) {
        return fuel * calculateFuelEfficiency();
    }

    @Override
    double maximumSpeed() {
        return 180.0; // Example value
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        // Specific logic for Motorcycle
        return 25.0; // Example value
    }

    @Override
    double distanceTraveled(double fuel) {
        return fuel * calculateFuelEfficiency();
    }

    @Override
    double maximumSpeed() {
        return 200.0; // Example value
    }
}

public class Vehical_Hierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Truck
        System.out.println("Enter Truck details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();

        Truck truck = new Truck(make, model, year, fuelType);
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Truck Distance Traveled for 10 liters: " + truck.distanceTraveled(10));
        System.out.println("Truck Maximum Speed: " + truck.maximumSpeed());

        // Input for Car
        System.out.println("\nEnter Car details:");
        System.out.print("Make: ");
        make = scanner.nextLine();
        System.out.print("Model: ");
        model = scanner.nextLine();
        System.out.print("Year: ");
        year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        fuelType = scanner.nextLine();

        Car car = new Car(make, model, year, fuelType);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Car Distance Traveled for 10 liters: " + car.distanceTraveled(10));
        System.out.println("Car Maximum Speed: " + car.maximumSpeed());

        // Input for Motorcycle
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Make: ");
        make = scanner.nextLine();
        System.out.print("Model: ");
        model = scanner.nextLine();
        System.out.print("Year: ");
        year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        fuelType = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(make, model, year, fuelType);
        System.out.println("Motorcycle Fuel Efficiency: " + motorcycle.calculateFuelEfficiency());
        System.out.println("Motorcycle Distance Traveled for 10 liters: " + motorcycle.distanceTraveled(10));
        System.out.println("Motorcycle Maximum Speed: " + motorcycle.maximumSpeed());

        scanner.close();
    }
}
