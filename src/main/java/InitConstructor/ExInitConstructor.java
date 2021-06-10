package InitConstructor;

class Calculator{
    int val1, val2; // 인스턴스 변수, 선언위치 클래스 영역, 생성시기(메모리 할당 시기) 인스턴스가 생성될 때
    public Calculator(int val1,int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public void sum(){ //인스턴스 메서드, 인스턴스를 생성해야 사용가능
        System.out.println(this.val1+this.val2);
    }
    public static void sum2(int val1, int val2){ //클래스 메서드, 인스턴스를 선언하지 않아도 사용가능
        System.out.println(val1+val2);
    }
}

public class ExInitConstructor {
    public static void main(String[] args){
        Calculator cl = new Calculator(10, 20);//생성자
        cl.sum();
        Calculator.sum2(20,30);
    }
}
