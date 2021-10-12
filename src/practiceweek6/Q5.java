package homework_6;

import java.util.Scanner;

  public class Q5
    {
   public static void main(String[]args)
  {
     int first,second,add,subtract,multiply;
     float devide;

     Scanner scanner= new Scanner(System.in);
     System.out.println("10,20");
     first = scanner.nextInt();
     second=scanner.nextInt();


       add = first +second;
       subtract=first - second;
       multiply=first * second;
       devide= (float)first / second;

       System.out.println("sum="+add);
       System.out.println("Different="+subtract);
       System.out.println("Multiplication="+ multiply);
       System.out.println("Division ="+devide);

    }
}
