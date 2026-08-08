public class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodDeliveryApp order = new FoodDeliveryApp("ORD1023", "Paneer Butter Masala", 249.0);

        FoodDeliveryApp.OrderDetails orderDetails = order.new OrderDetails();
        orderDetails.showOrder();

        // Anonymous class - order picked up
        DeliveryStatus picked = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("\nStatus : Order picked up by delivery partner.");
            }
        };
        picked.updateStatus();

        // Anonymous class - order delivered
        DeliveryStatus delivered = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status : Order delivered successfully.");
            }
        };
        delivered.updateStatus();
    }
}

interface DeliveryStatus {
    void updateStatus();
}

class FoodDeliveryApp {
    private String orderId;
    private String item;
    private double price;

    FoodDeliveryApp(String orderId, String item, double price) {
        this.orderId = orderId;
        this.item = item;
        this.price = price;
    }

    // Inner class to handle order details
    class OrderDetails {
        void showOrder() {
            System.out.println("Order ID : " + orderId);
            System.out.println("Item     : " + item);
            System.out.println("Price    : Rs." + price);
        }
    }
}
