package Abstract;

abstract class A {
    public A() {
    }
    public abstract int b();
    public void c(){
        System.out.println("c");
    }
}
class B extends A {
    @Override
    public int b() {
        return 0;
    }
}
public class ExAbstract {
    public static void main(String[] args){
        //A a = new A(); //abstract 클래스 때문에 안됨
        B b = new B();
        b.b();
        b.c();

    }
}
