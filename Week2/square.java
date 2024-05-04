import java.util.Scanner;

public class square {
    /*Take side of a square from user and print area and perimeter of it.
    Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */

    public static void main(String[] args) {
        double principal,time,rate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of a square");
        double length = scanner.nextDouble();
        System.out.println("Area of square is "+length*length);
        System.out.println("Area of perimeter is "+4*length);

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
        

        //Area of triangle and Volume of Cube and Cuboid
        double area ,volumeCube,volumeCuboid;
        System.out.println("Please enter base of triangle");
        
        double base = scanner.nextDouble();

        System.out.println("Please enter height of triangle");
        double height = scanner.nextDouble();

        area=0.5*base*height;
        System.out.println("Area of triangle is "+area);
        System.out.println();//blank line

        System.out.println("Enter the length of cube");

        double lengthCube = scanner.nextDouble();

        volumeCube = Math.pow(lengthCube,3);

        System.out.println("The volume of cube is "+volumeCube);
        System.out.println();
        System.out.println("Enter the length of cuboid");
        double lengthCuboid = scanner.nextDouble();
        System.out.println("Enter the breadth of cuboid");
        double breadthCuboid = scanner.nextDouble();
        System.out.println("Enter the height of cuboid");
        double heightCuboid = scanner.nextDouble();
        volumeCuboid = lengthCuboid*breadthCuboid*heightCuboid;

        System.out.println("The volume of cuboid is "+volumeCuboid);
    }
}
