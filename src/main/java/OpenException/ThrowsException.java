package OpenException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B{
    void run() throws FileNotFoundException ,IOException{
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        String input = br.readLine();
        System.out.println(input);
    }
}
class C{
    void run() throws FileNotFoundException, IOException{
        //public class FileNotFoundException extends IOException 이기때문에 FileNot예외는 삭제가능
        B b = new B();
        //예외는 중첩으로 사용가능 try안에 try 가능
        b.run();
    }
}


public class ThrowsException {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.run();
        } catch(FileNotFoundException e){
            System.out.println("파일이 필요합니다");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
