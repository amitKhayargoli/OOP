import java.util.Scanner;

public class positibe {
    // Write a JAVA program to check whether a number is negative, positive, or zero.

    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.out.println("Enter a number to check: ");

        int number1 = number.nextInt();

        if(number1>0){

            System.out.println(number1+" is a positive number");
        }
        else if(number1<0){
            System.out.println(number1+" is a neggative number");

        }
        else{
            System.out.println("zero");
        }
    }
}
