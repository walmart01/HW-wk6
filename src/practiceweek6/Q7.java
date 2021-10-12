package homework_6;

import java.util.Scanner;

public class Q7 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Fahrenheit:");
        double fahrenheit = input.nextDouble();

        double celsius =(( 5 * (fahrenheit-32.0))/9.0);
        System.out.println(fahrenheit+"degree Fahrenheit is equal to "+celsius+"in celsius");

        }
    }

