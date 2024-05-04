import java.util.Scanner;

class age{
    public static void main(String[] args) {
    // Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.

    Scanner vote = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = vote.nextInt();
    System.out.println((age>=1818)?"You are eligible to vote":"You are ineligible to vote");
   
}
}