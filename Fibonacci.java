import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        int x=0;
        int y=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp;
        System.out.println(x);
        System.out.println(y);
        
        while (true) {
            temp=x+y;
            if (temp<=n){
                System.out.println(temp);
            }else{
                break;
            }
            
            x=y;
            y=temp;
            }
        }
    }
