class Liquid{
    void detail(){
        System.out.println("This flows.");
    }

    void detail(int a){
        System.out.println("This includes water, which makes up "+a+"% of the earth's surface.");
    }
}

public class Overload{
    public static void main(String args[]) {
        Liquid obj=new Liquid();
        obj.detail();
        obj.detail(70);
    }
}
