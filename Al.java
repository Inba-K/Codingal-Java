import java.util.*;
public class Al{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(20);
        a.add(453);
        a.add(345);
        a.add(45345);
        int p;
        int r;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("What is r?");
        r=sc.nextInt();
        
        System.out.println("What is p?");
        p=sc.nextInt();
        
        System.out.println("What is Q? 1 or 2:");
        int Q=sc.nextInt();
        
        if (Q==1){
            if (p>=a.size()){
                System.out.println("Invalid index. Should be less than or equal to "+a.size());
                return;
            }
            a.add(p,r);
            System.out.println(a);
        }
        else if (Q==2){
            int i;
            for(i=0;i<a.size();i++){
                if(a.get(i)==p){
                    System.out.println("The index of "+p+" is "+i);
                    break;
                }
            }
            if (i==a.size()){
                System.out.println(-1);
            }
        }
        else{
            System.out.println("You must enter 1 or 2.");
        }
    }
}
