interface Operation {
    double PI = 3.142;
    double volume();
}

class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return PI * radius * radius * height;
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);
        double vol = cylinder.volume();
        System.out.println("Volume of the cylinder: " + vol);
    }
}