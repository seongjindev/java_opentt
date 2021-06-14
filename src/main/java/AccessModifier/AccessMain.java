package AccessModifier;

public class AccessMain {
    public void publicTest(){
        System.out.println("publicTest");
    }
    void defaultTest(){
        System.out.println("defaultTest");
    }
    private void privateTest(){
        System.out.println("privateTest");
    }
    protected void protectedTest(){
        System.out.println("protectedTest");
    }
}
