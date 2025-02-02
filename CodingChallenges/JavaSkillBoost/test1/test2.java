package test1;
public class test2{

    public static class car{
        public String brand;
        public String model;
        public int price;

        public void drive(){
            System.out.println("Driving..."+brand);
        }
    }
    public static void main(String[] args) {
        car c1= new car();
        c1.brand="Toyota";
        c1.model="Corolla";
        c1.price=20000;
        c1.drive();

    }
}