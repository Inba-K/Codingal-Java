import java.util.*;
public class AlQHW {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("The Arraylist before the first and last elements are replaced is "+a);
        int b=a.get(0);
        int c=a.get(3);
        a.set(0,c);
        a.set(3,b);
        System.out.println("The Arraylist after the first and last elements are replaced is "+a);
    }
}
