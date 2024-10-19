//SYMarks.java
package SY;

public class SYMarks {
    private int computerTotal;
    private int mathsTotal;
    private int electronicsTotal;

    public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicsTotal = electronicsTotal;
    }

    public int getComputerTotal() {
        return computerTotal;
    }
}


//TYMarks.java
package TY;

public class TYMarks {
    private int theory;
    private int practicals;

    public TYMarks(int theory, int practicals) {
        this.theory = theory;
        this.practicals = practicals;
    }

    public int getTheory() {
        return theory;
    }
}

//Student.java
import SY.SYMarks;
import TY.TYMarks;

import java.util.Scanner;

public class Student {
    private int rollNumber;
    private String name;
    private SYMarks syMarks;
    private TYMarks tyMarks;

    public Student(int rollNumber, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public void displayResult() {
        int totalMarks = syMarks.getComputerTotal() + tyMarks.getTheory();
        String grade;

        if (totalMarks >= 70) {
            grade = "A";
        } else if (totalMarks >= 60) {
            grade = "B";
        } else if (totalMarks >= 50) {
            grade = "C";
        } else if (totalMarks >= 40) {
            grade = "Pass Class";
        } else {
            grade = "FAIL";
        }

        System.out.printf("Roll Number: %d\nName: %s\nTotal Marks: %d\nGrade: %s\n", rollNumber, name, totalMarks, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("SY Computer Total: ");
            int syComputerTotal = scanner.nextInt();
            System.out.print("TY Theory Marks: ");
            int tyTheoryMarks = scanner.nextInt();

            SYMarks syMarks = new SYMarks(syComputerTotal, 0, 0); // Other subjects not used in calculation
            TYMarks tyMarks = new TYMarks(tyTheoryMarks, 0); // Practicals not used in calculation
            students[i] = new Student(rollNumber, name, syMarks, tyMarks);
        }

        System.out.println("\nResults:");
        for (Student student : students) {
            student.displayResult();
        }

        scanner.close();
    }
}

