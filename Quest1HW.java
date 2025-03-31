public class Quest1HW{
    String taste;
    String color;
    public String getTaste(){
        return taste;
    }
    public String getColor(){
        return color;
    }
    public void setTaste(String taste){
        this.taste=taste;
    }
    public void setColor(String color){
        this.color=color;
    }
    public static void main(String[] args) {
        Quest1HW b=new Quest1HW();
        b.setTaste("Sweet");
        b.setColor("Yellow");
        System.out.println("Taste: "+b.getTaste());
        System.out.println("Color: "+b.getColor());
    }
}
