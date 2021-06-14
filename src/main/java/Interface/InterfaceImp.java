package Interface;

public class InterfaceImp implements InterfaceTest, InterfaceTest2 { //여러개의 인터페이스를 구현할 수 있다
    @Override
    public void v() {

    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("info");
    }
}
