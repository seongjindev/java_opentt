package Scope;

class Exthis {
    int v = 10; //전역변수
    String name;
    int age;

    /*public Exthis(String name, int age) {//생성자, String name, int age는 지역변수
        this.name = name;
        this.age = age;
    }*/
    /*public Exthis(String name, int age) {//생성자, String name, int age는 지역변수
        name = name;//전역변수와 지역변수의 이름이 같기 때문에 안됨
        age = age;
    }*/
    public Exthis(String a, int b) {//생성자,지역변수
        name = a;//this를 안써도 됨
        age = b;
    }

    public Exthis() {//생성자
    }

    void m(){
        int v = 20; //지역변수
        System.out.println(v);
        System.out.println(this.v); //Exthis클래스의 v값
    }
}

public class ExScope {
    static int i; //전역변수
    static void a() { //메소드
        //int i = 0; //메소드 안에서만 사용할 수 있는 변수, 유효범위, 지역변수
        i=0;
    }
    static void b(){
        String title = "hello";
    }

    static int j=5; //전역변수
    static void c(){
        int j = 10;// 메소드의 지역변수, 선언위치 클래스 이외의 영역(메서드, 생성자, 초기화 블럭), 생성시기(메모리 할당 시기) 변수 선언문이 수행 되었을 때
        d();
    }
    static void d(){
        System.out.println(j); //전역변수를 가져옴
    }
    public static void main(String[] args){
        /*for(int i = 0;i<5;i++){ //i는 지역변수
            a();
            System.out.println(i);
        }*/
       /*i for(i = 0; i < 5; i++){
            a();
            System.out.println(i);
        }*/
        b();
        //System.out.println(title);
        c();

        Exthis et = new Exthis();
        et.m();
    }
}
