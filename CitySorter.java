import java.util.Arrays;
import java.util.Scanner;

public class CitySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        String[] cities = new String[n];
        
        System.out.println("Enter the names of the cities:");
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.nextLine();
        }
        
        Arrays.sort(cities);
        
        System.out.println("Cities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }
        
        scanner.close();
    }
}