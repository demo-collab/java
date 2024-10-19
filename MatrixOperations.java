import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Addition of Matrices");
            System.out.println("2. Multiplication of Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    addMatrices(scanner);
                    break;
                case 2:
                    multiplyMatrices(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
    
    private static void addMatrices(Scanner scanner) {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];

        System.out.println("Enter elements for Matrix 1:");
        inputMatrix(scanner, matrix1, rows, columns);
        
        System.out.println("Enter elements for Matrix 2:");
        inputMatrix(scanner, matrix2, rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Result of Addition:");
        printMatrix(result, rows, columns);
    }
    
    private static void multiplyMatrices(Scanner scanner) {
        System.out.print("Enter the number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 1: ");
        int columns1 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 2: ");
        int columns2 = scanner.nextInt();

        if (columns1 != rows1) {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[columns1][columns2];
        int[][] result = new int[rows1][columns2];

        System.out.println("Enter elements for Matrix 1:");
        inputMatrix(scanner, matrix1, rows1, columns1);
        
        System.out.println("Enter elements for Matrix 2:");
        inputMatrix(scanner, matrix2, columns1, columns2);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Result of Multiplication:");
        printMatrix(result, rows1, columns2);
    }
    
    private static void inputMatrix(Scanner scanner, int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    private static void printMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}