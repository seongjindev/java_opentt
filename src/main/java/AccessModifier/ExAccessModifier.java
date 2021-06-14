package AccessModifier;

import AccessModifierTest.AccessOther;

class A{
    public A() {
    }
    public void a(){
        System.out.println("a");
    }
    private void b(){
        System.out.println("b");
    }
    public void c() {
        b(); //클래스내에서는 사용가능
    }

}
class OtherTest extends AccessOther{
    public OtherTest() {
        AccessOther ao = new AccessOther();
        ao.OtherPublicTest();
        this.OtherProtectedTest();
        super.OtherProtectedTest();
    }
    public void nothing(){
        System.out.println("nothing");
    }
}
public class ExAccessModifier {
    public static void main(String[] args){
        //A a = new A();
        //a.a();
        //a.b(); //private 때문에 사용 불가
        AccessMain am = new AccessMain();
        am.publicTest();
        am.defaultTest();
        am.protectedTest();
        //am.privateTest();

        ClassTestPublic ctp = new ClassTestPublic(); //같은 클래스에서 사용가능
        ClassTestDefault ctd = new ClassTestDefault(); //같은 클래스에서 사용가능

    }
}
