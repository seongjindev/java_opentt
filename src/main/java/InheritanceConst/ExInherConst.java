package InheritanceConst;

class Calcu2 {
    int a,b;
    //public Calcu2(){} //기본생성자를 없애면 하위 클래스에서 super를 사용해야함
    public Calcu2(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void sum(){
        System.out.println(this.a+this.b);
    }
}
class subst2 extends Calcu2 { //부모클래스의 생성자를 호출한다
    public subst2(int a, int b) { //생성자
        super(a, b);//super는 부모 클래스를 의미한다, 부모클래스의 생성자, 상위클래스의 초기화먼저해야함
        //super 다음에 초기화를 시켜야함
    }
    public void subst() {
        System.out.println(this.a-this.b);
    }
}
class subst3 extends subst2 {
    public subst3(int a, int b) {
        super(a, b);
    }
}
public class ExInherConst {
    public ExInherConst() {} //생성자는 반환형이 필요없음
    public ExInherConst(int n) {} //파라미터가 있는 생성자를 만들고, 파라미터 없이 인스턴스화 할려면 파라미터가 없는 생성자를 만들어야함
    public static void main(String[] args){
        ExInherConst eic = new ExInherConst();
    }
}
