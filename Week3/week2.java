public class week2{

    public static void main(String[] args) {
        
        // Write a JAVA program to find the maximum between three numbers.

        int a=25223,b=43326,c=9000;
        
        int max=((a>b && b>c)?a:(b>c&&c>a)?b:c);
        

        System.out.println("The max number is "+max);
    }
}