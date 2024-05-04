import java.util.Scanner;

public class divisible {
    
    public static void main(String[] args) {
        
        // Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println((number%5==0 && number%11==0)?"Divisible":"Not divisible");

        // Write a JAVA program to check whether a number is even or odd

        System.out.println((number%2==0)?"even":"odd");

        

    }
}
