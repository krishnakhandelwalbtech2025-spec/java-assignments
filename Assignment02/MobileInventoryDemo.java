public class MobileInventoryDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy S24", 79999.0);
        Mobile m2 = new Mobile(m1);   // duplicate record created using the copy constructor

        System.out.println("Original Mobile Record:");
        m1.display();

        System.out.println("\nDuplicated Mobile Record:");
        m2.display();
    }
}

class Mobile {
    String brand;
    String model;
    double price;

    // parameterized constructor
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // copy constructor
    Mobile(Mobile m) {
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : Rs." + price);
    }
}
