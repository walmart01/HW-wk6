package homework_6;

import java.util.Scanner;

public class Q13 {
    public static void main(String[]args){

      Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Sum is"+(a+b+c));
        System.out.println("Average is"+(a+b+c)/3.0);

    }
}
