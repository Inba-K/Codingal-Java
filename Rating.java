import java.util.*;
public class Rating {
    public static void main(String args[]){
        System.out.println("What do you think is the rating of Toy Story?");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("G");
                break;
            case 2:
                System.out.println("PG");
                break;
            case 3:
                System.out.println("PG-13");
                break;
            case 4:
                System.out.println("R");
                break;
            case 5:
                System.out.println("NC-17");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
