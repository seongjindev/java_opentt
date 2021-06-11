package Inheritance;

import ClassMInstanceM.Calcu;

class subst extends Calcu { //상속받을 때는 extends사용
    public subst(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void substract() { //인스턴스 메서드
        System.out.println(this.a - this.b);
    }

}
class multiplication extends Calcu { //상속받을 때는 extends사용
    public void multipy(){
        System.out.println(this.a * this.b);
    }
}
class division extends multiplication { //상속을 또 할 수 있음
    public void div() {
        System.out.println(this.a/this.b);
    }
}

public class ExInheritance {
    public static void main(String[] args){
        subst ss = new subst(20,30); //인스턴스화
        //ss.setOprands(20,10); //인자
        ss.sum();
        ss.substract();

        multiplication ml = new multiplication();
        ml.setOprands(20,10);
        ml.sum();
        ml.multipy();

        division dv = new division();
        dv.setOprands(20, 10);
        dv.sum();
        dv.div();

    }
}
