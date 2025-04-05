import java.util.*;
public class Quest6HW {
    private int a;
    private float b=a/100;
    Scanner sc=new Scanner(System.in);
    public void getPoints(){
        return a;
    }
    public void getScore(){
        return b;
    }
    public void setPoints(int a){
        this.a=a;
    }
    public void setScore(float b){
        this.b=b;
    }
    public static void main(String[] args) {
        Quest6HW c=new Quest6HW();
        System.out.println("What is your score?");
        int d=sc.nextInt();
        c.setPoints(d);
        c.setScore();
        System.out.println("Your score is "+c.getScore());
    }
}
