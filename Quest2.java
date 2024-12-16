class Animal{
    public void makeSound(){
        System.out.println("Animals make sound.");
    }
    public void detail(){
        System.out.println("Animals can be different because of their details.");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("A cat meows");
        super.makeSound();
    }
    public void detail(){
        System.out.println("This cat is 10 years old.");
        System.out.println("This cat's name is fluffy.");
        super.detail();
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("A dog barks.");
        super.makeSound();
    }
    public void detail(){
        System.out.println("This dog is 3 years old.");
        System.out.println("This dog's name is Spike.");
        System.out.println("The breed of this dog is Labrador.");
        super.detail();
    }
}
public class Quest2{
    public static void main(String[] args) {
        Dog c=new Dog();
        c.makeSound();
        c.detail();
    }
}
