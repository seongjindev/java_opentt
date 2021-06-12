package Overriding;

import ClassMInstanceM.Calcu;

class OverridingCalcu extends Calcu{

    @Override
    public void sum() {
        System.out.println("실행결과는 "+(this.a+this.b));
    }

    @Override
    public void avg() {
        super.avg();
    }
}

public class ExOverriding {
    public static void main(String[] args){
        OverridingCalcu occ = new OverridingCalcu();
        occ.setOprands(10,20);
        occ.sum();


    }
}
