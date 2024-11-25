interface Age{
    public void display();
}
interface Name{
    public void show(); 
}
public class Inter implements Age,Name{
    public void display(){
        System.out.println("I am 12 years old.");
    }
    public void show(){
        System.out.println("My name is Inba Karthikeyan.");
    }
    public static void main(String[] args) {
        Age a=new Inter();
        Name b=new Inter();
        a.display();
        b.show();
    }
}
