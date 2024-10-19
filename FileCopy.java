import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of the source file: ");
            String sourceFileName = br.readLine();
            System.out.print("Enter the name of the destination file: ");
            String destinationFileName = br.readLine();

            reader = new BufferedReader(new FileReader(sourceFileName));
            writer = new BufferedWriter(new FileWriter(destinationFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Contents copied from " + sourceFileName + " to " + destinationFileName + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the files: " + e.getMessage());
            }
        }
    }
}