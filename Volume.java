public class Volume {
    private int a;
    private int b;
    private int c;
    private int vol;
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getVol(){
        return a*b*c;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public static void main(String[] args) {
        Volume val=new Volume();
        val.setA(3);
        val.setB(8);
        val.setC(4);
        System.out.println("Volume: "+val.getVol());
    }
}
