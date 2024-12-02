//Consider the following class: public class Book { private String title; private String author; private int numPages; public Book(String t, String a, int np) { title = t; author = a; numPages = np; } public String getTitle() { return title; } public String getAuthor() { return author; } public int getNumPages() { return numPages; } } Write a constructor for a subclass of Person called Student that takes three parameters: a name, an age, and a major. The Student class should have an additional method called getMajor() that returns the student's major.
class Student{
    private String name;
    private int age;
    private String maj;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getMaj(){
        return maj;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setMaj(String maj){
        this.maj=maj;
    }
}
public class Setg{
    public static void main(String args[]){
        Student a=new Student();
        a.setName("Inba K.");
        a.setAge(24);
        a.setMaj("Computer Science");
        System.out.println("Hello, my name is "+a.getName()+", and I am "+a.getAge()+" years old. My major is "+a.getMaj()+".");
    }
}
