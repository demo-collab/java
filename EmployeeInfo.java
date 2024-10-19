class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSal;

    public Employee(int empId, String empName, String empDesignation, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + 
               "\nEmployee Name: " + empName + 
               "\nEmployee Designation: " + empDesignation + 
               "\nEmployee Salary: " + empSal;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Alice Smith", "Software Engineer", 75000);
        System.out.println(employee);
    }
}