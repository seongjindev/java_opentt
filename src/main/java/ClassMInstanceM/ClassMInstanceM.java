package ClassMInstanceM;

class Calcu{
    static final double PI =3.1415; //클래스 소유, 클래스 변수
    static int base = 0;//클래스 변수
    int a, b; //인스턴스의 소유, 인스턴스 변수

    public Calcu() { //생성자
    }

    public void setOprands(int a, int b){ //인스턴스 메서드
        this.a = a;
        this.b = b;
    }
    public void sum(){ //인스턴스 메서드
        System.out.println(this.a+this.b);
    }
    public void avg(){ //인스턴스 메서드
        System.out.println((this.a+this.b)/2);
    }
    public static void sum2(int a, int b){ //클래스 메서드
        System.out.println(a+b);
    }
    public static void avg2(int a, int b){ //클래스 메서드
        System.out.println((a+b)/2);
    }


}

public class ClassMInstanceM {
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
