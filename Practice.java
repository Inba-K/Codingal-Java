class Fruit{
    void detail(){
        System.out.println("Veggies that have seeds are scientifically known as fruits.");
    }
}

class Banana extends Fruit{
    @Override
    void detail(){
        System.out.println("Banana is a fruit because it has seeds.");
    }
}

public class Practice{
    public static void main(String args[]){
        Fruit obj2=new Banana();
        Fruit obj1=new Fruit();
        obj1.detail();
        obj2.detail();

    }
}
