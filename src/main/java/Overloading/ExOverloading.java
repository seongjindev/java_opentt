package Overloading;

import ClassMInstanceM.Calcu;

class OverloadingDemo {

//    void printA (){
//    }
//    int printA(){ //리턴값만 다를 수 없다
//        return 0;
//    }
}
public class ExOverloading {
    public static void main(String[] args){
        Calcu cc = new Calcu();
        cc.setOprands(10, 20);
        cc.sum();
        cc.setOprands(10,20,30);
        cc.sum();

    }
}
