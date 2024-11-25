import java.util.*;
public class Except{
    public static void main(String[] args) {
        System.out.println("This is used to find the number of items per box.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items you have:");
        int a=sc.nextInt();
        System.out.println("Enter the number of boxes you have");
        int b=sc.nextInt();
        try{
            if (b==0){
                throw new Exception("You can't divide by 0.");
            }
            System.out.println("The number of items per box is "+a/b);
        }
        catch(Exception err){
            System.out.println("Division undefined.");
            System.out.println(err.getMessage());
        }
        finally{
            System.out.println("Have a good day!");
        }
    }
}
