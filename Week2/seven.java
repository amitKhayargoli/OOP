import java.util.Scanner;

public class seven {
    /*
     *  Take the name, roll number, and field of interest from the user and print in the format below: 
     * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
     */

     public static void main(String[] args) {
        
        Scanner details = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = details.nextLine();
        System.out.println("Enter your roll number");
        String roll = details.nextLine();
        System.out.println("Enter your interests");
        String interest = details.nextLine();

        System.out.println("Hey, my name is "+name+" and my roll number is "+roll+". My field of interest are "+interest+".");
        
    }
}
