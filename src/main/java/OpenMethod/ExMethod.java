package OpenMethod;

import java.io.*;
import java.util.Scanner;

public class ExMethod {
    //정의
    public static void numbering(){
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
    //오버로딩
    public static void numbering(int limit){//매개변수 parameter
        int i = 0;
        while(i<limit){
            System.out.println(i);
            i++;
        }
    }

    public static String numbering(int init, int limit){ //String 자리는 return 값의 타입 지정
        int i = init;
        String output = "";
        while(i<limit) {
            output += i;
            i++;
        }
        return output;
        //retrun 1;
        //retrun 2; 리턴은 여러개 할 수 없음 - 조건에 따라 여러개를 넣을 수 있음(if나 case 등등)

    }

    public static void main(String[] args){
        numbering();//호출
        numbering(5);//인자 argument
        String a = numbering(3,5);
        System.out.println(a);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
            bw.write(a);
            bw.close();
        } catch(IOException e){
        }
    }
}
