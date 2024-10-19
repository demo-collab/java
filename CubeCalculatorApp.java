import java.util.Scanner;

@FunctionalInterface
interface CubeCalculator {
    int calculateCube(int number);
}

public class CubeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its cube: ");
        int number = scanner.nextInt();

        CubeCalculator cubeCalc = (n) -> n * n * n;
        int cube = cubeCalc.calculateCube(number);

        System.out.printf("The cube of %d is: %d%n", number, cube);
        
        scanner.close();
    }
}