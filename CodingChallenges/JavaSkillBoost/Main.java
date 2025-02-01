// Define the Car class
// Main class
public class main {
    
    static class Car{
        public String brand;
        public String name;
        public int price;

    // Method
    public void race() {
        System.out.println("Race is good..");
    }
}
    public static void main(String[] args) {
        // Creating an object of Car
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.name = "Corolla";
        c1.price = 123654;

        // Calling the race method
        c1.race(); // Output: Race is good..
    }
}
