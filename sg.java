public class sg{
    private String color;
    private String taste;
    public String getColor(){
        return color;
    }
    public String getTaste(){
        return taste;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setTaste(String taste){
        this.taste=taste;
    }
    public static void main(String args[]){
        sg apple=new sg();
        apple.setColor("Red");
        apple.setTaste("Sweet");
        System.out.println("Color: "+apple.getColor());
        System.out.println("Taste: "+apple.getTaste());
    }
}
