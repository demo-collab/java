import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWordLineCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name as a command line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            int wordCount = 0;
            int lineCount = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lineCount++;
                    wordCount += line.split("\\s+").length;
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }
}