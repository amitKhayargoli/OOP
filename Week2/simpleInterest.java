import java.security.Principal;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        double principal,time,rate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount");
        principal = scanner.nextDouble();

        System.out.println("Enter time in years");
        time = scanner.nextDouble();

        System.out.println("Enter rate of interest");
        rate = scanner.nextDouble();

        System.out.println("We have");
        System.out.println("Principal amount = "+principal);
        System.out.println("Time = "+time);
        System.out.println("Rate = "+rate);

        double SI = (principal*time*rate)/100;
        System.out.println();
        System.out.println("Simple Interest = "+SI);
    
    }
}
