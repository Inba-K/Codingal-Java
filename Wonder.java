class Wonders{
    void display(){
        System.out.println("There are 7 wonders of the world.");
    }
}
class India extends Wonders{
    @Override
    void display(){
        System.out.println("One is the Taj Mahal, in India.");
    }
}
class Rome extends Wonders{
    @Override
    void display(){
        System.out.println("Another is the Colosseum, in Rome.");
    }
}
class China extends Wonders{
    @Override
    void display(){
        System.out.println("Another is the Great Wall of China, in China.");
    }
}
class Brazil extends Wonders{
    @Override
    void display(){
        System.out.println("Another is Christ the Redeemer, in Brazil.");
    }
}
class Jordan extends Wonders{
    @Override
    void display(){
        System.out.println("Another is Petra, in Jordan.");
    }
}
class Peru extends Wonders{
    @Override
    void display(){
        System.out.println("The last one is Machu Picchu, in Peru.");
    }
}
public class Wonder{
    public static void main(String args[]){
        Wonders a=new Wonders();
        Wonders b=new India();
        Wonders c=new Rome();
        Wonders d=new China();
        Wonders e=new Brazil();
        Wonders f=new Jordan();
        Wonders g=new Peru();
        a.display();
        b.display();
        c.display();
        d.display();
        e.display();
        f.display();
        g.display();
    }
}
