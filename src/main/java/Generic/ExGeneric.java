package Generic;

class PersonTest<T> { //데이터 타입을 설정하지 않는다 인스턴스화 시킬 때 데이터 타입을 넣는다
    public T info;
}

public class ExGeneric {
    public static void main(String[] args){
        PersonTest<String> p1 = new PersonTest<String>(); //인스턴스화 시킬 때 데이터 타입을 넣는다
        PersonTest<StringBuilder> p2 = new PersonTest<StringBuilder>();

    }
}
