public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Yamaha R15", "Sports Bike", 136);

        // Using the inner class
        Vehicle.VehicleDetails details = bike.new VehicleDetails();
        details.display();

        // Anonymous class performing an action
        Action start = new Action() {
            public void performAction() {
                System.out.println("\nThe vehicle engine has started.");
            }
        };
        start.performAction();
    }
}

interface Action {
    void performAction();
}

class Vehicle {
    private String name;
    private String type;
    private int speed;

    Vehicle(String name, String type, int speed) {
        this.name = name;
        this.type = type;
        this.speed = speed;
    }

    // Inner class to display vehicle details
    class VehicleDetails {
        void display() {
            System.out.println("Vehicle Name : " + name);
            System.out.println("Vehicle Type : " + type);
            System.out.println("Top Speed    : " + speed + " km/h");
        }
    }
}
