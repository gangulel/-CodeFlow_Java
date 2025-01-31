/*Day 4 - Basic Arithmetic Operations
1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them. Print the results to the console.
2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result.
3. Modify the above program to read decimal numbers as the length and width, and output the area to two decimal points

Reading List:
1. Learn about formatting options such as precision, alignment, and decimal places to present output in a clear and concise manner*/
import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        //sum of the two number
        int x=20;
        int y=10;
        int sum=x+y;
        System.out.println("Sum of the two numbers is "+sum);
        int multificatin=x*y;
        System.out.println("The multiplicative number is "+multificatin);
        int divition=x/y;
        System.out.println("The division of two numbers is "+divition);
        int mod=x%y;
        System.out.println("The modulo of two numbers is "+mod);

        Scanner sc=new Scanner(System.in);

        //get user input calculates the area using integer number
        System.out.println("Enter the length number");
        int length=sc.nextInt();
        System.out.println("Enter the width number");
        int width=sc.nextInt();
        int area=length*width;
        System.out.println("The area of two numbers is "+area);

        //get user input calculates the area using flot number
        System.out.println("Enter the length number");
        double length2=sc.nextDouble();
        System.out.println("Enter the width number");
        double width2=sc.nextDouble();
        double area2=length2*width2;
        System.out.println("The area of two numbers is "+area2);

    }
}