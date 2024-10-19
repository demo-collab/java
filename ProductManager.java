interface ProductMarker {}

class Product implements ProductMarker {
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;
    private static int objectCount = 0;

    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.productCost = 0.0;
        this.productQuantity = 0;
        objectCount++;
    }

    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++;
    }

    public void displayProductDetails() {
        System.out.printf("Product ID: %d\nProduct Name: %s\nProduct Cost: %.2f\nProduct Quantity: %d\n",
                productId, productName, productCost, productQuantity);
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 800.50, 5);
        Product product2 = new Product(2, "Smartphone", 500.25, 10);
        Product product3 = new Product();

        System.out.println("Product Details:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();

        System.out.println("Total number of Product objects created: " + Product.getObjectCount());
    }
}