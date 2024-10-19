import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    protected String company;
    protected double price;

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("Company: %s, Price: %.2f\n", company, price);
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Type: Light Motor Vehicle, Mileage: %.2f km/l\n", mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacity;

    public HeavyMotorVehicle(String company, double price, double capacity) {
        super(company, price);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Type: Heavy Motor Vehicle, Capacity: %.2f tons\n", capacity);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle type (1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter company name: ");
            String company = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            if (type == 1) {
                System.out.print("Enter mileage (km/l): ");
                double mileage = scanner.nextDouble();
                vehicles.add(new LightMotorVehicle(company, price, mileage));
            } else if (type == 2) {
                System.out.print("Enter capacity (tons): ");
                double capacity = scanner.nextDouble();
                vehicles.add(new HeavyMotorVehicle(company, price, capacity));
            } else {
                System.out.println("Invalid vehicle type. Please enter 1 or 2.");
                i--;
            }
            scanner.nextLine();
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}