import java.util.Scanner;

public class areawithswitches {
    
    public static void main(String[] args) {
        // Implement a Java program that calculates the area of different shapes 
        // (circle, rectangle, square, triangle) based on the user's choice using a switch case.


    final double PI=3.14;
    double area;
    int shape,r,l,b,h;
    boolean continueloop=true;
    Scanner scanner= new Scanner(System.in);

    while(continueloop){
    System.out.println();
    System.out.println("**AREA CALCULATOR PROGRAM**");
    System.out.println("Find the area of \n1)Circle\n2)Rectangle\n3)Square\n4)Triangle\n5)Exit");

    shape = scanner.nextInt();
    
    switch(shape){
        case 1:System.out.println("To find the area of Circle:\nPress 1 to Proceed");
        int circle=scanner.nextInt();
        switch(circle){
            case 1:System.out.println("Enter the radius of circle");
            r=scanner.nextInt();
            area=PI*Math.pow(r, 2);
            System.out.printf("The area of the circle is %.2f",area);

            }
            break;
            
        case 2:System.out.println("To find the area of Rectangle:\nPress 1 to Proceed");
        int rectangle=scanner.nextInt();
        switch(rectangle){
            case 1:System.out.println("Give me some input Human");
            System.out.println("Enter length");
            double length=scanner.nextDouble();
            System.out.println("Enter breadth");
            double breadth=scanner.nextDouble();

            area=length*breadth;
            System.out.println("The area of the rectangle is "+area);

        }
        break;

        case 3:System.out.println("To find the area of square:\nPress 1 to Proceed");
        int square=scanner.nextInt();

        switch(square){
            case 1:System.out.println("Give me some input Human");
       
            System.out.println("Enter length");
            double length=scanner.nextDouble();

            area=length*length;
            System.out.println("The area of the square is "+area);
        }
        break;

        case 4:System.out.println("To find the area of triangle:\nPress 1 to Proceed");
        int triangle=scanner.nextInt();

        switch(triangle){
            case 1:System.out.println("Give me some input Human");
            System.out.println("Enter base");
            double base=scanner.nextDouble();
            System.out.println("Enter height");
            double height=scanner.nextDouble();

            area=0.5*base*height;
            System.out.println("The area of the Triangle is "+area);
        }
        break;

        
        case 5:
        continueloop=false;
        break;
        
        default:System.out.println("Invalid input");
        break;
    }
}
}
}