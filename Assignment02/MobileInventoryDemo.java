class MobilePhone { 
private String brand; 
private String model; 
private double price;  
public MobilePhone() { 
this.brand = "Generic"; 
this.model = "Standard"; 
this.price = 0.0; 
}  
public MobilePhone(String brand, String model, double price) { 
this.brand = brand; 
this.model = model; 
this.price = price; 
} 
public MobilePhone(MobilePhone other) { 
this.brand = other.brand; 
this.model = other.model; 
this.price = other.price; 
} 
public void display() { 
System.out.println("Brand : " + brand + " | Model : " + model + " | Price : $" + 
price); 
} 
} 
public class MobileInventorySystem { 
public static void main(String[] args) { 
System.out.println("=== Mobile Phone Inventory System ==="); 
MobilePhone defaultPhone = new MobilePhone(); 
MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 999.99); 
MobilePhone duplicatePhone1 = new MobilePhone(phone1); 
System.out.println("\n--- Default Record ---"); 
defaultPhone.display(); 
System.out.println("\n--- Original Record ---"); 
phone1.display(); 
System.out.println("\n--- Duplicate Record (Cloned Object) ---"); 
duplicatePhone1.display(); 
} 
}
