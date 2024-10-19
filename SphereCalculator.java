import java.util.Scanner;

class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

public class SphereCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        Sphere sphere = new Sphere(radius);
        double volume = sphere.calculateVolume();
        double surfaceArea = sphere.calculateSurfaceArea();

        System.out.printf("Volume of the sphere: %.2f\n", volume);
        System.out.printf("Surface Area of the sphere: %.2f\n", surfaceArea);

        scanner.close();
    }
}