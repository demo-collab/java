import java.util.Scanner;

class StudentInfo {
    private int rollNo;
    private String name;
    private String className;
    private double percentage;

    public StudentInfo(int rollNo, String name, String className, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.percentage = percentage;
    }

    public void displayInfo() {
        System.out.printf("Roll No: %d%nName: %s%nClass: %s%nPercentage: %.2f%%%n", rollNo, name, className, percentage);
    }
}

public class StudentPer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Class: ");
        String className = scanner.nextLine();

        double totalMarks = 0;
        int subjects = 6;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += scanner.nextDouble();
        }

        double percentage = (totalMarks / (subjects * 100)) * 100;

        StudentInfo student = new StudentInfo(rollNo, name, className, percentage);
        student.displayInfo();

        scanner.close();
    }
}