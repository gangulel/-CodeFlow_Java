public class test1 {
    // Making Phone a static inner class
    public static class Phone {
        public String brand;
        public String model;
        public int price;

        public void call() {
            System.out.println("Calling..." + brand);
        }
    }

    public static void main(String[] args) {
        // Now you can create an instance of Phone directly
        Phone p1 = new Phone();
        p1.brand = "Samsung";
        p1.model = "Galaxy S21";
        p1.price = 1000;
        p1.call(); // Output: Calling...Samsung
    }
}
