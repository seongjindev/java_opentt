package Polymorphism;

class A{
    public String x() {
        return "x";
    }
}
class B extends A{
    @Override
    public String x() {
        return "B.x()";
    }

    public String y(){
        return "y";
    }

}
class B2 extends A{
    @Override
    public String x() {
        return "B2.x()";
    }
}

public class PolymorphismClass {
    public static void main(String[] args){
        A obj = new B(); //클래스B로 인스턴스를 만들었지만 클래스A 데이터 타입을 가짐
        System.out.println(obj.x());
        //obj.y(); //데이터 타입이 A이기 때문에 실행안됨
        //클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다.
        //동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지한다.
        A obj2 = new B2();
        System.out.println(obj2.x()); //각각의 클래스의 소속되어있는 메서드의 정의되어있는 방식대로 동작한다
    }
}
