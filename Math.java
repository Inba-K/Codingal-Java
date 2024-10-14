import java.util.*;
class Input{
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    String c;
    void input(){
        System.out.println("What would you like for a?");
        a=sc.nextInt();
        System.out.println("What would you like for b?");
        b=sc.nextInt();
        System.out.println("What operation would you like to perform?");
        c=sc.next();
        c.trim();
        
    }
}

class Calc extends Input{
    int d;

    void calc(){
        if (c.equals("multiplication")){
            System.out.println(a*b);
        } else if (c.equals("division")){
            if (b!=0){
                System.out.println(a/b);
            } else{
                System.out.println("Error: No zeros as divisor.");
            }
        } else if (c.equals("addition")){
            System.out.println(a+b);
        } else if (c.equals("subtraction")){
            System.out.println(a-b);
        } else{
            System.out.println("Error: "+c);
        }
    }
}

public class Math{
    public static void main(String args[]){
        Calc e=new Calc();
        e.input();
        e.calc();
    }
}
