package homework_6;

import java.util.Scanner;

public class Q15 {
    public static void main(String[]args){
         int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
         a= sc.nextInt();
         b= sc.nextInt();
         temp=a;
         a=b;
         b=temp;

         System.out.println("After Swapping the value of a="+a+" the value of b="+b);


    }

}
