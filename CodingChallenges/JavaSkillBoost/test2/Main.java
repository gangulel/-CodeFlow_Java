class car{
    String color;
    int price;

    car(String color,int price){
        this.color=color;
        this.price=price;
    }
}

public class Main {
    public static void main(String[] array){
        car c1=new car("red",2000);
        System.out.println(c1.color);
    }
}
