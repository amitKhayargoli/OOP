import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
        
    
    // vowel or consonant.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an alphabet");
    String a=scanner.nextLine();
    
    a=a.toLowerCase();
   
    boolean isVowel=false;

    String vowels[]={"a","e","i","o","u"};

        for (String vowel : vowels){
            if (vowel.equals(a)){
                isVowel=true;
                break;
            }

        }
        if(isVowel){
            System.out.println(a+" is a vowel");
        }
        else{
            System.out.println(a+" is not a vowel");
        }
        
}

}