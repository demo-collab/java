import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReverseFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the text file: ");
        String filePath = scanner.nextLine();
        
        StringBuilder content = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        String reversedContent = content.reverse().toString();
        String changedCaseContent = changeCase(reversedContent);
        
        System.out.println("Reversed and Case Changed Content:");
        System.out.println(changedCaseContent);
        
        scanner.close();
    }

    private static String changeCase(String input) {
        StringBuilder changedCase = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                changedCase.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                changedCase.append(Character.toUpperCase(c));
            } else {
                changedCase.append(c);
            }
        }
        return changedCase.toString();
    }
}