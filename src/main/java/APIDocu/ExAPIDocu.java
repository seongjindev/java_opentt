package APIDocu;

import ClassMInstanceM.Calcu;

import java.io.PrintStream;

class APIDocuTest {
    static Calcu outTest = null;
    public static final PrintStream out = null;
}

public class ExAPIDocu {
    public static void main(String[] args) {
        System.out.println(1);
        APIDocuTest.out.println(1);
        APIDocuTest.outTest.sum2(50,60);



        Calcu c = null;
        c.sum2(10,20);
        Calcu.sum2(10,30);

    }
}
