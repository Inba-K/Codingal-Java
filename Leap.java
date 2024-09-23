import java.util.*;
public class Leap {
    public static void main(String args[]){
        String a="It's a leap year";
        String b="It's not a leap year";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your year:");
        int year=sc.nextInt();
        if (year%4==0){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
