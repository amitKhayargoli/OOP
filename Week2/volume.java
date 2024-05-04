import java.util.Scanner;

public class volume {
    // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

    
    public static void main(String[] args) {
        
        double area ,volumeCube,volumeCuboid;

        Scanner scanner = new Scanner(System.in);
        
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
