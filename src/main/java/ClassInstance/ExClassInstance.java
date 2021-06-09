package ClassInstance;
class Cal{
    static final double PI =3.14; //클래스 소유
    int a, b; //인스턴스의 소유

    public void setOprands(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void sum(){
        System.out.println(this.a+this.b);
    }
    public void avg(){
        System.out.println((this.a+this.b)/2);
    }
}
public class ExClassInstance {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void avg(int a, int b){
        System.out.println((a+b)/2);
    }

    public static void main(String[] args){
        System.out.println(10+20);
        System.out.println(20+40);

        sum(10,20);
        sum(20,40);

        int a, b;
        a = 10;
        b = 20;
        sum(a,b);
        avg(a,b);

        a = 20;
        b = 40;
        sum(a,b);
        avg(a,b);

        Cal c1 = new Cal();//인스턴스 생성
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
    }
}
