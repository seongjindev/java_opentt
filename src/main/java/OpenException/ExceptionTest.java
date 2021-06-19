package OpenException;

//class DivdeException extends RuntimeException{ //unchecked로 처리
//    public DivdeException() {
//        super();
//    }
//    DivdeException(String message){
//        super(message);
//    }
//}

class DivdeException extends Exception{ //checked로 처리
    public int left;
    public int right;
    public DivdeException() {
        super();
    }
    public DivdeException(String message) {
        super(message);
    }
    public DivdeException(String message, int left, int right){ //기능을 추가할 수 있음
        super(message);
        this.left = left;
        this.right = right;
    }
}

class Calculator2 {
    int left, right;
    public void setOprands(int left, int right){
//        if(right == 0){
//            throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다");
//        }
        this.left = left;
        this.right = right; //IllegalArgumentException
    }
    public void divide() throws DivdeException{ //호출한 쪽에서 처리하도록 하는 방법
        if(right == 0){
            throw new DivdeException("0으로 나눌 수 없습니다", this.left, this.right);
        }
//        try{ //try ~ check로 처리 가능
//            if(right == 0){
//                throw new DivdeException("0으로 나눌 수 없습니다");
//            }
//        }catch(DivdeException e){
//            e.printStackTrace();
//        }
        System.out.print(this.left/this.right);
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        Calculator2 c2 = new Calculator2();
        c2.setOprands(10,0);
        try{
            c2.divide();
        }catch(DivdeException e){
            System.out.println(e.getMessage());
            System.out.println(e.left);
            System.out.println(e.right);
        }

    }
}
