public class Cap{
    private int a;
    private String b;
    public int getA(){
        return a;
    }
    public String getB(){
        return b;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(String b){
        this.b=b;
    }
    public static void main(String args[]){
        Cap c=new Cap();
        c.setA(13);
        c.setB("Inba");
        System.out.println("Hello, my name is"+c.getB()+", and I am "+c.getA()+" years old");
    }

}
