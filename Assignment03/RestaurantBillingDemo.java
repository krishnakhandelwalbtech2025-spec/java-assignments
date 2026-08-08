public class RestaurantBillingDemo {
    public static void main(String[] args) {
        RestaurantBilling billing = new RestaurantBilling();

        double dineInBill = billing.calculateBill(500.0);
        double takeawayBill = billing.calculateBill(450.0, 20.0);
        double deliveryBill = billing.calculateBill(600.0, 40.0, true);

        System.out.println("Dine-In Bill  : Rs." + dineInBill);
        System.out.println("Takeaway Bill : Rs." + takeawayBill);
        System.out.println("Delivery Bill : Rs." + deliveryBill);
        System.out.println("Total Orders  : " + RestaurantBilling.totalOrders);
    }
}

class RestaurantBilling {
    static int totalOrders = 0;   // static variable tracking total orders

    double calculateBill(double amount) {                               // dine-in
        totalOrders++;
        return amount;
    }

    double calculateBill(double amount, double packagingCharge) {       // takeaway
        totalOrders++;
        return amount + packagingCharge;
    }

    double calculateBill(double amount, double deliveryCharge, boolean isDelivery) {   // delivery
        totalOrders++;
        return amount + deliveryCharge;
    }
}
