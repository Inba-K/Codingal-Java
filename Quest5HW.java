public class Quest5HW {
    private String name;
    private int age;

    public void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        student.setAge(22);
        System.out.println("Updated Age: " + student.getAge());
    }
}
