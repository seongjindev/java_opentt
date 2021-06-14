package Final;
class CalcuFinal{
    static final double PI = 3.14; //모든 인스턴스에서 바뀌지 않는 것
    static int a = 10; //하나의 인스턴스에서 바꾸면 모든 인스턴스에서 적용됨, 클래스 변수
    public static final void sum(){
    }

}
class FinalMethod extends CalcuFinal{
    //void sum(){} //final 메서드는 오버라이드 불가능
}
final class FinalClass{ //클래스에도 final를 넣을 수 있음
    public FinalClass() {
    }
}
//class FinalClassExtends extends FinalClass{} //final클래스는 상속 받을 수 없다

public class ExFinal {
    public static void main(String[] args){
        //원의 크기 구하기
        int a = 3;
        double b = a * a * CalcuFinal.PI;
        System.out.println();
    }

}
