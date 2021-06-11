package ClassMInstanceM;

public class ExClassMInstanceM {
    public static void main(String[] args){
        Calcu cc = new Calcu();
        System.out.println(cc.PI);

        Calcu cc2 = new Calcu();
        System.out.println(cc2.PI);

        System.out.println(Calcu.PI);

        cc.setOprands(10,20);
        cc.sum();

        Calcu.sum2(10,20); //직접 접근해서 실행가능, 클래스 메서드

    }
}
