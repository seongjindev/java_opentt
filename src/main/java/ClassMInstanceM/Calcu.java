package ClassMInstanceM;

public class Calcu{
    static final double PI =3.1415; //클래스 소유, 클래스 변수, 선언위치 클래스 영역, 생성시기(메모리 할당 시기) 클래스가 메모리에 올라갈 때
    static int base = 0;//클래스 변수
    public int a, b, c, d, e; //인스턴스의 소유, 인스턴스 변수, 선언위치 클래스 영역, 생성시기(메모리 할당 시기) 인스턴스가 생성될 때

//    public Calcu() { //생성자
//    }

    public void setOprands(int a, int b){ //인스턴스 메서드
        this.a = a;
        this.b = b;
    }
    public void setOprands(int a, int b, int c){ //오버로딩
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setOprands(int a, int b, int c,int d){
        this.setOprands(a,b,c);//로직 재활용성, 중복제거, 유지보수 편의성
        this.d = d;
    }
    public int setOprands(int a, int b, int c, int d, int e){
        return 0;
    }
    public void sum(){ //인스턴스 메서드
        System.out.println(this.a+this.b+this.c);
        base = 100; //인스턴스 메서드는 클래스 멤버에 접근 할 수 있다
        //sum2(10,20); //인스턴스 메서드는 클래스 멤버에 접근 할 수 있다
    }
    public void avg(){ //인스턴스 메서드
        System.out.println((this.a+this.b)/2);
    }
    public static void sum2(int a, int b){ //클래스 메서드
        System.out.println(a+b);
        //this.a =10; 클래스 메서드는 인스턴스 멤버에 접근 할 수 없다
        //sum(); 클래스 메서드는 인스턴스 멤버에 접근 할 수 없다
    } //클래스 메서드, 인스턴스를 생성하지 않아도 사용할 수 있음
    public static void avg2(int a, int b){ //클래스 메서드
        System.out.println((a+b)/2);
    } //클래스 메서드, 인스턴스를 생성하지 않아도 사용할 수 있음


}