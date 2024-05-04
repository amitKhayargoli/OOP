import java.util.Scanner;

public class product {
    // Take two integer inputs from the user. 
    // First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter the first number");
        double n1 = numbers.nextDouble();

        System.out.println("Enter the second number ");
        double n2 = numbers.nextDouble();

        double sum = n1+n2;
        double product= n1*n2;

        double division = product / sum;

        System.out.println("sum = "+sum);
        System.out.println("product = "+product);

        System.out.println("Dividing "+product+" By "+sum+":");
        System.out.println("Division = "+division);

}
}