public class max {
    
    public static void main(String[] args) {
        
        // Write a JAVA program to find the maximum between three numbers.

        int a = 435,b=433,c=322;

        if(a>b&&b>c){
            System.out.println("Greatest number is "+a);
        }
        else if(b>c&&c>a){
            System.out.println("Greatest number is "+b);
        }
        else{
            System.out.println(c+" is the greatest number");
        }


    }
}
