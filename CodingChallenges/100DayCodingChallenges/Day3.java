/*Day 3 - Input and Output
1. Write a program that reads user input and print it to the console.
2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
3. Write a program to read the user input using Scanner class

Reading List:
1. Explore various methods for reading different type of inputs*/

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        //get the input
        System.out.println("Enter the number of students: ");
        int number=x.nextInt();//input number of student
        x.nextLine();
        System.out.println("Enter the name of batch top: ");
        String name=x.nextLine();// input batch top Name
        System.out.println("Enter GPA in batch top: ");
        double gpa=x.nextDouble();// input  batch top GPA

        // print input value
        System.out.println(number+" students in the class");
        System.out.println("The name of batch top is "+name);
        System.out.println("GPA is "+gpa);


    }
}