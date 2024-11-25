import java.util.*;
public class Bank {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your interest rate? Enter as a decimal.");
        float inra=sc.nextFloat();
        System.out.println("What is your loan amount?");
        float pri=sc.nextFloat();
        System.out.println("How long do you have to pay it?");
        float yr=sc.nextFloat();
        try{
            if (yr==0){
                throw new Exception("The years can't be 0.");
            }
            System.out.println(pri*(inra+1)/yr);
        }
        catch(Exception err){
            System.out.println("Division undefined.");
            System.out.println(err.getMessage());
        }
        finally{
            System.out.println("Thanks for using my calculator!");
        }
    }
}
