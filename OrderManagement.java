import java.util.Scanner;

abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void acceptDetails();

    public abstract void displayDetails();
}

class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(int id, String description) {
        super(id, description);
    }

    @Override
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer Name for Purchase Order ID " + id + ": ");
        customerName = scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order {
    private String vendorName;

    public SalesOrder(int id, String description) {
        super(id, description);
    }

    @Override
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Vendor Name for Sales Order ID " + id + ": ");
        vendorName = scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];
        SalesOrder[] salesOrders = new SalesOrder[3];

        for (int i = 0; i < 3; i++) {
            purchaseOrders[i] = new PurchaseOrder(i + 1, "Purchase Order " + (i + 1));
            purchaseOrders[i].acceptDetails();
        }

        for (int i = 0; i < 3; i++) {
            salesOrders[i] = new SalesOrder(i + 1, "Sales Order " + (i + 1));
            salesOrders[i].acceptDetails();
        }

        System.out.println("\n--- Purchase Orders ---");
        for (PurchaseOrder po : purchaseOrders) {
            po.displayDetails();
            System.out.println();
        }

        System.out.println("--- Sales Orders ---");
        for (SalesOrder so : salesOrders) {
            so.displayDetails();
            System.out.println();
        }
    }
}