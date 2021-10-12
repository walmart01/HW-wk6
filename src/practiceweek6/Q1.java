package homework_6;

public class Q1 {

    int x =15;              //instance variable1
    int y =10;             //instance variable2

     public void addition(){//instance method
        System.out.println(x);
        System.out.println(y);
    }
    
    public static void main(String[]args){
        Q1 obj =new Q1();
        obj.addition();
    }
}
