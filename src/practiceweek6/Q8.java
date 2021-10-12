package homework_6;


import java.util.Scanner;

public class Q8 {
    class AreaTriangleDemo {

    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("width of the Triangle");
        double base = scanner.nextDouble();

        System.out.println("height of the Triangle");
        double height = scanner.nextDouble();
        //area =(width*height)/2
        double area =(base*height)/2;


        System.out.println("Area of the Triangle is:"+area);
    }
}


