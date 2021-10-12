package homework_6;

public class Q4 {
    String name=" world  ";
    String place=" most beautiful ";

    static String city = "Agra";
    static String two="Taj Mahal";

    //Instance method
    void method1(){
        System.out.println(name);
        System.out.println(place);
        System.out.println(Q4.city);
        System.out.println(Q4.two);
    }
//Static method
    public static void method2(){
        Q4 obj =new Q4();
    }
}
