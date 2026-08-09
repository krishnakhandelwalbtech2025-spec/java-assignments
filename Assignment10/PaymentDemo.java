public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("4321567812349876");
        Payment p2 = new UpiPayment("krishna@upi");

        p1.pay(2500.0);
        p2.pay(799.0);
    }
}

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void pay(double amount) {
        String lastFour = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Paid Rs." + amount + " using Credit Card ending in " + lastFour);
    }
}

class UpiPayment extends Payment {
    String upiId;

    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI ID: " + upiId);
    }
}
