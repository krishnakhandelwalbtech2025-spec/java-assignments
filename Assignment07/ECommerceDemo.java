public class ECommerceDemo {
    public static void main(String[] args) {
        ProductInterface[] products = new ProductInterface[3];
        products[0] = new Electronic("Laptop", 55000.0, "2 Years");
        products[1] = new Clothing("T-Shirt", 599.0, "L");
        products[2] = new Grocery("Rice Bag", 450.0, "12-2026");

        for (ProductInterface p : products) {
            p.displayDetails();
        }
    }
}

interface ProductInterface {
    void displayDetails();
}

abstract class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronic extends Product implements ProductInterface {
    String warranty;

    Electronic(String name, double price, String warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public void displayDetails() {
        System.out.println("Electronic Item -> Name: " + name +
                ", Price: Rs." + price + ", Warranty: " + warranty);
    }
}

class Clothing extends Product implements ProductInterface {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Clothing Item -> Name: " + name +
                ", Price: Rs." + price + ", Size: " + size);
    }
}

class Grocery extends Product implements ProductInterface {
    String expiryDate;

    Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    public void displayDetails() {
        System.out.println("Grocery Item -> Name: " + name +
                ", Price: Rs." + price + ", Expiry: " + expiryDate);
    }
}
