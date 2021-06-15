package Polymorphism;

class Over{
    public void a(int param){
        System.out.println("숫자출력 = " + param);
    }
    public void a(String param){
        System.out.println("문자출력 = " + param);
    }
}

public class PolymorphismOverloading {
    public static void main(String[] args){
        Over o = new Over();
        o.a(1);
        o.a("문자");
    }
}
