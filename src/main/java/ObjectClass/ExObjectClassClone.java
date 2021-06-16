package ObjectClass;

class Human{
    protected String test(){
        return "test";
    }
}
class Man extends Human implements Cloneable{
    String name;

    public Man(String name) {
        this.name = name;
    }
}

public class ExObjectClassClone {
    public static void main(String[] args) {
        Man man = new Man("superman");
        man.test();

    }
}
