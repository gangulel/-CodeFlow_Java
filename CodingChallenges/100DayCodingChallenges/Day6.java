/*Day 6 - Type Conversion
Write a program that performs the following tasks:
Convert a String to an Integer
Convert a String to a Float
Convert an Integer to a String using valueOf() method
Convert an Integer to a String using toString() method*/

public class Day6 {
    public static void main(String[] args) {

        //String to number
        String number="100";
        int num=Integer.parseInt(number);
        System.out.println(num);

        //int to number
        int number2=255;
        String num2=Integer.toString(number2);
        System.out.println(num2);

        //String to Float
        String number3="145.6";
        float num3=Float.parseFloat(number3);
        System.out.println(num3);

        //using valueOf
        String value=String.valueOf(number);
        System.out.println(value);

        //using toString
        String value2=Integer.toString(number2);
        System.out.println(value2);
    }
}

