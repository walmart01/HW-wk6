package homework_6;

import java.util.Scanner;

public class Q6 {
    /**
     * Java program to calculate area of a circle
     */

        public static void main(String[]args){
            System.out.println("Enter redius of circle:");
            Scanner sn = new Scanner(System.in);
            Double radius =sn.nextDouble();

            Double area = Math.PI * radius * radius;
            System.out.println("Area = "+area);



        }
    }

