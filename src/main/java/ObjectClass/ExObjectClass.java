package ObjectClass;

import java.util.Arrays;

class O{

}

class O2 extends Object{ //오브젝트 클래스는 항상 상속한다

}

class Calcu {
    int left, right;

    public void setOprands(int left, int rigth){
        this.left = left;
        this.left = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

    @Override
    public String toString() {
        return "Calcu{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
class Student implements Cloneable { //clone을 사용하기 위해 cloneable 인터페이스 구현 필요,
    // 비어있는 인터페이스를 왜 구현하느냐? -> JVM에게 복제가 가능하다는것을 알려주기 위해 구분자의 역할
    String name;

    public Student(String name) {
        this.name = name;
    }
    public boolean equals(Object obj){
        Student s = (Student)obj; //형변환 필요
        return this.name==s.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { //오버라이딩할때 부모클래스의 메서드 접근제어자 보다 더 작게 할 수 없다
        return super.clone();
    }
}

public class ExObjectClass {
    public static void main(String[] args) {
        Calcu cc = new Calcu();
        cc.setOprands(10,20);
        System.out.println(cc);
        System.out.println(cc.toString()); //extends Object를 상속받았기때문에 toString을 사용할 수 있음, 문자화시킴, 안써도 toString이 적용됨

        Student s1 = new Student("sam");
        Student s2 = new Student("sam");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.name==s2.name);
        System.out.println(s1.name.equals(s2.name));

        String s3 = "sam";
        String s4 = new String("sam");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        int[] a = {1,2,3,3,4,5};
        int[] b,c;
        b = Arrays.copyOf(a, a.length);
        c = a.clone();

        Student sc1 = new Student("green");
        Student sc2;
        try {
            sc2 = (Student)sc1.clone(); //Object클래스로 반환하기 때문에 Student로 형변환해야함
            System.out.println(sc1.name);
            System.out.println(sc2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
