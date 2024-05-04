import java.util.Scanner;

public class areaTypecast {
    public static void main(String[] args) {
        
        // Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of rectangle");
        double length = scanner.nextDouble();
        
        System.out.println("Enter the breadth of rectangle");

        double breadth = scanner.nextDouble();

        double area = length*breadth;

        System.out.println("Double value of area is "+area);
        int IntArea = (int)area;

        System.out.println("Integer value = "+IntArea);
    }
}
