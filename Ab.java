abstract class Animal{
    abstract void size();
    void eat(){
        System.out.println("Animals need to eat food to live.");
    }
}
class Rhino extends Animal{
    void size(){
        System.out.println("A rhino is big.");
    }
}
class Ant extends Animal{
    void size(){
        System.out.println("An ant is small.");
    }
}
public class Ab{
    public static void main(String args[]){
        Animal a=new Rhino();
        a.eat();
        a.size();
        Animal b=new Ant();
        b.eat();
        b.size();
    }
}
