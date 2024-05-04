import java.util.Scanner;

public class add {
    // Write a program to take two integer inputs from the user and print the sum and product of them.

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter the first number");
        double n1 = numbers.nextDouble();

        System.out.println("Enter the second number ");


        double n2 = numbers.nextDouble();

        System.out.println("The sum of "+n1+" and "+n2+" is "+(n1+n2));
        System.out.println("The product of "+n1+" and "+n2+" is "+(n1*n2));
    }
}
