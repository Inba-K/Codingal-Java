import java.util.*;
public class AlQ{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(15);
        a.add(14);
        a.add(13);
        a.add(12);
        System.out.println("The Arraylist before the reverse is "+a);
        int b=a.get(0);
        int c=a.get(1);
        int d=a.get(2);
        int e=a.get(3);
        a.set(0,e);
        a.set(1,d);
        a.set(2,c);
        a.set(3,b);
        System.out.println("The Arraylist after the reverse is "+a);
    }
}
