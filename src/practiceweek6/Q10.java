package homework_6;

import java.util.Scanner;
//8*1=8
//8*2=16
//8*3=24
//8*4=32
//8*5=40
//8*6=48
//8*7=56
//8*8=64
//8*9=72
//8*10=80

public class Q10 {
    public static void main(String[]args){
         int number,multiplier;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();


         for(int i=1;i<=10;i++) {
            System.out.println(i+" x "+n+" = "+i*n);


        }
    }
}
