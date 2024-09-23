import java.util.*;
public class Nat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int s=0;
        for (int i=0;i<=num;i++){
            s=s+i;
        }System.out.println(s);
    }
}
