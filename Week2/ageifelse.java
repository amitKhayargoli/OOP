import java.util.Scanner;

public class ageifelse {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        double age = scanner.nextDouble();

        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote bbg");
        }
        

    }
}
