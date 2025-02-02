package test1;
// Car class with a constructor
public class Car {
    String brand;
    String name;
    int price;

    // Constructor
    public Car(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    // Method to display details
    public void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Name: " + name);
        System.out.println("Car Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating objects using the constructor
        Car c1 = new Car("Toyota", "Corolla", 25000);
        Car c2 = new Car("BMW", "BMW I8", 120000);

        // Calling the display method
        c1.display();
        System.out.println(); // Line break
        c2.display();
    }
}

