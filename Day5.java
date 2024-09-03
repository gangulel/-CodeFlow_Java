/*Day 5 - Compound Assignment Operators
1. Write a program that utilizes increment(++) and decrement(--) operators.
2. Write a program that utilizes the following compound operators +=, -=, *=, /=, and %=.*/
public class Day5 {
    public static void main(String[] args) {
        //pre increment
        int x=10;
        int y=++x;
        System.out.println(x);
        System.out.println(y);

        //post increment
        int a=10;
        int b=a++;
        System.out.println(a);
        System.out.println(b);

        x+=1;
        System.out.println("The x+=1 is: "+x);

        x-=1;
        System.out.println("The x-=1 is: "+x);

        x*=2;
        System.out.println("The x*=1 is: "+x);

        x/=2;
        System.out.println("The x/=1 is: "+x);

        x%=2;
        System.out.println("The x%=1 is: "+x);
    }
}
