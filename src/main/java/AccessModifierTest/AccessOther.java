package AccessModifierTest;

public class AccessOther {
    public void OtherPublicTest(){
        System.out.println("publicTest");
    }
    void OtherDefaultTest(){
        System.out.println("defaultTest");
    }
    private void OtherPrivateTest(){
        System.out.println("privateTest");
    }
    protected void OtherProtectedTest(){
        System.out.println("protectedTest");
    }
}
