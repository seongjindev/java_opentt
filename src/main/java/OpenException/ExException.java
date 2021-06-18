package OpenException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Calculator {
    int left, right;
    public void setOprands(int left, int right){
//        if(right == 0){
//            throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다");
//        }
        this.left = left;
        this.right = right; //IllegalArgumentException
    }
    public void divide(){
        //ArithmeticException
        if(right == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        try{
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다");
        }catch(Exception e){ //메서드랑 비슷하게 생김
            System.out.println(".getMessage : \n"+ e.getMessage()); //간단한 예외사항
            System.out.println(".toString : \n"+e.toString()); //좀 더 자세한 정보
            System.out.println("e.printStackTrace()\n"); //화면에 에러사항 출력
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
class A {
    private int[] arr = new int[3];

    public A() {
        arr[0] =0;
        arr[1] =10;
        arr[2] =20;
    }
    public void z(int first, int second){
        try{
            System.out.println(arr[first]/arr[second]);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException e");
            //e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){ //여러가지 예외를 설정할 수 있다
            System.out.println("ArrayIndexOutOfBoundsException e");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("finally");
        }
    }
}

public class ExException {
    public static void main(String[] args){
        Calculator cc = new Calculator();
        cc.setOprands(10,0);
        try{
            cc.divide();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("완료");

        System.out.println("--------------------");

        A a = new A();
        a.z(10,0);
        a.z(1,0);
        a.z(2,1);

        System.out.println("----------------------");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String input = null;
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(input);

    }
}
