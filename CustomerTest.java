import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    private int custNo;
    private String custName;
    private String contactNumber;
    private String custAddr;

    public Customer(int custNo, String custName, String contactNumber, String custAddr) {
        this.custNo = custNo;
        this.custName = custName;
        this.contactNumber = contactNumber;
        this.custAddr = custAddr;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void displayDetails() {
        System.out.printf("Customer No: %d\nName: %s\nContact Number: %s\nAddress: %s%n",
                custNo, custName, contactNumber, custAddr);
    }
}

public class CustomerTest {
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer(1, "Alice", "1234567890", "123 Main St"));
        customers.add(new Customer(2, "Bob", "9876543210", "456 Elm St"));
        customers.add(new Customer(3, "Charlie", "5555555555", "789 Oak St"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact number to search for customer: ");
        String searchContactNumber = scanner.nextLine();

        searchCustomerByContactNumber(searchContactNumber);
        scanner.close();
    }

    public static void searchCustomerByContactNumber(String contactNumber) {
        for (Customer customer : customers) {
            if (customer.getContactNumber().equals(contactNumber)) {
                customer.displayDetails();
                return;
            }
        }
        System.out.println("Customer not found with contact number: " + contactNumber);
    }
}