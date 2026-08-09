public class FoodOrderDemo {
    public static void main(String[] args) {
        FoodOrder order1 = new DineInOrder("Krishna", 600.0);
        order1.displayBill();

        System.out.println();

        FoodOrder order2 = new TakeAwayOrder("Rahul", 450.0);
        order2.displayBill();
    }
}

abstract class FoodOrder {
    String customerName;

    FoodOrder(String customerName) {
        this.customerName = customerName;
    }

    abstract double calculateBill();

    void displayBill() {
        System.out.println("Customer   : " + customerName);
        System.out.println("Total Bill : Rs." + calculateBill());
    }
}

class DineInOrder extends FoodOrder {
    double foodAmount;
    double serviceCharge = 50.0;

    DineInOrder(String customerName, double foodAmount) {
        super(customerName);
        this.foodAmount = foodAmount;
    }

    double calculateBill() {
        return foodAmount + serviceCharge;
    }
}

class TakeAwayOrder extends FoodOrder {
    double foodAmount;
    double packagingCharge = 20.0;

    TakeAwayOrder(String customerName, double foodAmount) {
        super(customerName);
        this.foodAmount = foodAmount;
    }

    double calculateBill() {
        return foodAmount + packagingCharge;
    }
}
