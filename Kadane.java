import java.lang.Math;
public class Kadane{
    public static int a(int[] data){
        int b=data[0];
        int c=data[0];
   
        for(int i=0;i<data.length;i++){
            c=Math.max(data[i],c+data[i]);
            b=Math.max(b,c);
        }
        return b;
    }    
    public static void main(String[] args) {
        int[] data={1,2,3,4,5,-6,-7,-8,-9,-10};
        System.out.println("The max sum of the subarray is "+a(data));
    }
}
