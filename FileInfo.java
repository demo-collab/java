import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("Is readable: " + file.canRead());
            System.out.println("Is writable: " + file.canWrite());
            if (file.isDirectory()) {
                System.out.println("Type: Directory");
            } else if (file.isFile()) {
                System.out.println("Type: Regular file");
            }
            System.out.println("File length: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}