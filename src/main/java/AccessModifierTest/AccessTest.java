package AccessModifierTest;

import AccessModifier.AccessMain;
import AccessModifier.ClassTestPublic;

class AccessExtends extends AccessMain{
    public AccessExtends() {
    }

    @Override
    protected void protectedTest() {
        super.protectedTest();
    }
}
public class AccessTest {
    public static void main(String[] args){
        AccessMain am = new AccessMain();
        am.publicTest();

        AccessExtends ae = new AccessExtends();
        ae.publicTest();
        ae.protectedTest();

        ClassTestPublic ctp = new ClassTestPublic();
        //ClassTestDefault ctd = new ClassTestDefault(); //다른패키지에서 디폴트(default) 클래스 불가능
    }
}
