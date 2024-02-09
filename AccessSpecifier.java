public class AccessSpecifier {
    private int productId;
    private String productName;
    private double price;

    public AccessSpecifier(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    protected void printDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    private boolean isExpensive() {
        return price > 100.0;
    }

    public static void main(String[] args) {
        AccessSpecifier product = new AccessSpecifier(1, "Sample Product", 150.0);

        // Accessing public method to get product ID
        int productId = product.getProductId();
        System.out.println("Product ID: " + productId);

        // Accessing protected method to print details
        product.printDetails();

        // Accessing private method to check if the product is expensive
        if (product.isExpensive()) {
            System.out.println("This product is expensive.");
        } else {
            System.out.println("This product is not expensive.");
        }
    }
}
