public class he{

    public static void main(String[] args) {
        /*1. Write a program that prints Hello World! to the console. Save the program as Hello.java. */
        System.out.println("Hello World!");


        /* 2. Extend/Modify the above program to print two additional lines: 
        This is my first program

        I am on module ST4003CEM

        System.out.print (not println) and produces the same output.
        */

        System.out.println("This is my first program");
        System.out.println("I am on module ST4003CEM");

        System.out.print("Hello World!\nThis is my first program\nI am on module ST4003CEM");
        

        /* 3. Write a program that prints the following output:

        A "quoted" String is

        'much' better if you learn

        the rules of "escape sequences."

        Also, "" represents an empty

        String. Don't forget: use \"

        instead of " !

        '' is not the same as " */

        System.out.print("A \"quoted\" String is\n'much' better if you learn\n the rules of \"escape sequences.\" \nAlso, \"\" represents an empty \n String. Don't forget: use \" \ninstead of \" ! '' \nis not the same as \"\" ");

        /*4. WAP that prints the following pattern:

            *

            **

            ***

            ****
         */

        int i,j,rows=4;

        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println();

        /*
        5. WAP prints the following pattern:

        *********

        *********

        *********

        *********
         */

        int a,b;
        for(a=1;a<=4;a++){
            for(b=1;b<=9;b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*6. WAP that prints the following output:

        A well-formed Java program has a main method with { and } braces.



        A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.

        (But we type \" instead!)

        What is the difference between

        a ' and a "?  Or between a " and a \"?



        One is what we see when we're typing our program. The other is what appears on the "console." */


    System.out.print("A well-formed Java program has a main method with { and } braces.\n\nA System.out.println statement has ( and ) and usually a String that\nstarts and ends with a \" character.\n(But we type \" instead!)\nWhat is the difference between\na ' and a \"?Or between a \" and a \\\"?\n\nOne is what we see when we're typing our program. The other is what appears on the \"console.\"");
    
    





    }
}
