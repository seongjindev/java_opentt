package Polymorphism;
interface I{

}
interface I2{
    String a();
}
interface I3{
    String b();
}
class C implements I{

}
class D implements I2, I3{ //인터페이스 I2, I3을 구현한다, 다중으로 가능
    @Override
    public String a() {
        return "a()";
    }

    @Override
    public String b() {
        return "b()";
    }
}
public class PolymorphismInterface {
    public static void main(String[] args){
        I obj = new C(); //인스턴스화

        D obj1 = new D();
        I2 obj2 = new D();
        I3 obj3 = new D();

        obj1.a();
        obj1.b();

        obj2.a();
        //obj2.b(); //해당 인터페이스가 가지고 있는 것만 사용한다

        //obj3.a();
        obj3.b();
    }
}
