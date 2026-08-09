public class VehicleInsuranceDemo {
    public static void main(String[] args) {
        CarInsurance car = new CarInsurance("MH12AB1234", "Hyundai Creta", 12500.0);
        car.showInsuranceInfo();

        System.out.println();

        BikeInsurance bike = new BikeInsurance("MH14CD5678", "Yamaha R15", 3200.0);
        bike.showInsuranceInfo();
    }
}

class Vehicle {
    String regNumber;
    String model;

    Vehicle(String regNumber, String model) {
        this.regNumber = regNumber;
        this.model = model;
    }

    void showVehicleInfo() {
        System.out.println("Registration No : " + regNumber);
        System.out.println("Model           : " + model);
    }
}

class CarInsurance extends Vehicle {
    double premium;

    CarInsurance(String regNumber, String model, double premium) {
        super(regNumber, model);
        this.premium = premium;
    }

    void showInsuranceInfo() {
        super.showVehicleInfo();
        System.out.println("Premium         : Rs." + premium);
        System.out.println("Insurance Type  : Car Insurance");
    }
}

class BikeInsurance extends Vehicle {
    double premium;

    BikeInsurance(String regNumber, String model, double premium) {
        super(regNumber, model);
        this.premium = premium;
    }

    void showInsuranceInfo() {
        super.showVehicleInfo();
        System.out.println("Premium         : Rs." + premium);
        System.out.println("Insurance Type  : Bike Insurance");
    }
}
