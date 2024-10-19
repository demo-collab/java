class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0;

    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.deptName = "None";
        this.salary = 0.0;
    }

    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
        System.out.println("Employee object created. Total count: " + objectCount);
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public void displayEmployeeDetails() {
        System.out.printf("ID: %d, Name: %s, Department: %s, Salary: %.2f%n", id, name, deptName, salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "HR", 50000);
        emp1.displayEmployeeDetails();
        
        Employee emp2 = new Employee(2, "Bob", "IT", 60000);
        emp2.displayEmployeeDetails();
        
        Employee emp3 = new Employee(3, "Charlie", "Finance", 55000);
        emp3.displayEmployeeDetails();

        System.out.println("Total Employee Objects Created: " + Employee.getObjectCount());
    }
}