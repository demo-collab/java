public class BMICalculator {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide FirstName, LastName, Weight (in kg), and Height (in meters).");
            return;
        }
        
        String firstName = args[0];
        String lastName = args[1];
        double weight;
        double height;
        
        try {
            weight = Double.parseDouble(args[2]);
            height = Double.parseDouble(args[3]);
        } catch (NumberFormatException e) {
            System.out.println("Weight and Height must be valid numbers.");
            return;
        }
        
        double bmi = calculateBMI(weight, height);
        System.out.printf("Name: %s %s\nWeight: %.2f kg\nHeight: %.2f m\nBMI: %.2f\n", 
                          firstName, lastName, weight, height, bmi);
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}