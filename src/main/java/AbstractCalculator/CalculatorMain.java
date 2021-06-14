package AbstractCalculator;

abstract class Calculator{ //추상 클래스
    int left, right; //인스턴스 변수
    public void setOp(int left,int right){ //인스턴스 메서드 - 접근제어자는 public, void-리턴이 없는 메서드
        this.left = left;
        this.right = right;
    }
    int _sum(){ //디폴트 제어자 -같은 패키지에서만 사용가능, int-리턴이 int형이여야 한다
        return this.left+this.right;
    }
    public abstract void sum(); // abstract를 사용하면 해당 클래스는 abstract 클래스가 됨
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalPlus extends Calculator{ //추상클래스를 extends 키워드를 사용한다
    @Override//메서드 선언부가 부모클래스 메서드와 일치, 접근제어자가 부모클래스 메서드보다 크면안됨, 예외처리도 부모클래스 메서드보다 크면 안됨
    public void sum() {
        System.out.println("+++++sum" + (this.left+this.right));
    }

    @Override
    public void avg() {
        System.out.println("+++++avg" + (this.left+this.right));
    }
}
class CalMinus extends Calculator{
    @Override
    public void sum() {
        System.out.println("-----sum"+ (this.left+this.right));
    }

    @Override
    public void avg() {
        System.out.println("-----avg"+(this.left+this.right));
    }
}

public class CalculatorMain {
    public static void main(String[] args){
        CalPlus cp = new CalPlus();
        cp.setOp(10,20);
        cp.run();

        CalMinus cm = new CalMinus();
        cm.setOp(10,20);
        cm.run();

    }
}
