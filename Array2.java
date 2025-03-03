import java.util.*;
public class Array2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you want the values in this 2D array to be?");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();

        int[][] arr={
            {a,b,c},{d,e,f}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
