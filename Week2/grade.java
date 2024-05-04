import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        
        Scanner marks = new Scanner(System.in);

        System.out.println("Enter the marks obtained in Science");
        double science = marks.nextDouble();
        System.out.println("Enter the marks obtained in math");
        double math = marks.nextDouble();
        System.out.println("Enter the marks obtained in english");
        double english = marks.nextDouble();
        System.out.println("Enter the marks obtained in nepali");
        double nepali = marks.nextDouble();

        double total = science + math + english + nepali;

        int fullmarks = 4*100;
        double Percentage = (total / fullmarks)*100;

        System.out.println("The candidate obtained "+Percentage+"%");
        System.out.println((Percentage>=70?"First class":(Percentage>59)?"Upper Second Class":(Percentage>49)?"Second Class":(Percentage>39)?"Third Class":(Percentage<40)?"Fail":"Invalid"));
        
    }
}
