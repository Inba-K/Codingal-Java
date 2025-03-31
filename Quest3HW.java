class Country{
    void display(){
        System.out.println("There are many countries.");
    }
    void display(int b){
        System.out.println("There are "+b+" countries in the world.");
    }
}
class India extends Country{
    @Override
    void display(){
        System.out.println("India is a country.");
    }
}
public class Quest3HW{
    public static void main(String args[]) {
        Country obj1=new Country();
        Country obj2=new India();
        obj1.display();
        obj1.display(110);
        obj2.display();
    }
}
