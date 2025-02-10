import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        int t=n;

        for(int i=0;i<n;i++){
            System.out.println("Enter the elements:");
            a[i]=sc.nextInt();
        }

        for(t=n-1;t>=0;t--){
            System.out.println(a[t]+"\n");
        }
    }
}
