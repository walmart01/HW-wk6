package homework_6;

import java.util.Scanner;

public class Q14 {
    public static void main(String[]args) {

        // Area = Hight* Width
        //Perimeter =2*(Hight+Width)
    }
        Scanner scanner =new Scanner(System.in);

    {
        int height = 0;
        int width = 0;
        int  area = 0;
        int perimeter = 0;

        System.out.println("Enter the height of Rectangle");
        height = scanner.nextInt();

        System.out.println("Enter the width of Rectangle ");
        width = scanner.nextInt();
        area = height * width;
        int i = height + width;
        perimeter = 2 * (height + width);

        System.out.println("The Area of Rectangle is :"+ area);
        System.out.println("The Perimeter of Rectangle is :"+ perimeter);


    }
        }





