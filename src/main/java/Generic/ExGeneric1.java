package Generic;

//abstract class Info{
//    public abstract int getLevel();
//}
interface Info{
    public abstract int getLevel();
}

class StudentInfo{
    public int grade;
    public StudentInfo(int grade) {
        this.grade = grade;
    }
}
class StudentPerson{
    public StudentInfo info;
    public StudentPerson(StudentInfo info) {
        this.info = info;
    }
}
class EmployeeInfo implements Info{
    public int rank;
    public EmployeeInfo(int rank) {
        this.rank = rank;
    }

    @Override
    public int getLevel() {
        return this.rank;
    }
}
class EmployeePerson{
    public EmployeeInfo info;
    public EmployeePerson(EmployeeInfo info) {
        this.info = info;
    }
}
class Person0 {
    public Object info;
    public Person0(Object info) { //Object로 했기 때문에 모든 데이터 타입이 들어간다
        this.info = info;
    }
}

class Person<T, S>{ //StudentPerson과 EmployeePerson를 사용하지 않고 가능하다, 복수의 제네릭 설정 가능, 일반적으로 대문자 T부터 쓴다
    //참조형 데이터 타입만 올 수 있다
    public T info;
    public S id;
    public Person(T info,S id) {
        this.info = info;
        this.id = id;
    }
    //메소드에도 제네릭을 사용할 수 있다
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}

class PersonExtends<T extends Info>{ //Info가 interface여도 상관없다, 제네릭 안에서 사용할 때는 상속한다는 개념보다 부모가 누군지 확인하는 개념이기 때문
    //super는 부모를 제한
    public T info;

    public PersonExtends(T info) {
        this.info = info;
        info.getLevel();
    }
}

public class ExGeneric1 {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade);
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);
        //StudentPerson과 EmployeePerson는 사실상 똑같은 메커니즘

        //Person0 p1 = new Person0("부장");
        //EmployeeInfo eif = (EmployeeInfo)p1.info;//런타임 - 타입이 안전하지 않다

        Person0 sp0 = new Person0(si);
        Person0 ep0 = new Person0(ei);

//        Person<StudentInfo, Integer> sp2 = new Person<>(si);
//        System.out.println(sp2.info.grade);
//        Person<EmployeeInfo, Integer> ep2 = new Person<>(ei);
//        System.out.println(ep2.info.rank);

        //Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1),1); //참조형 데이터 타입만 사용할 수 있다
        Integer id = new Integer(1);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),id); //참조형 데이터 타입만 사용할 수 있다
        //기본 데이터 타입을 객체로 포장하는 개체 = wrapper 클래스 - Integer, Double 등등
        System.out.println(p1.id.intValue()); //wrapper클래스가 담고있는 원래 숫자를 원시데이터 타입으로 가져올 수 있음

        //제네릭의 생략
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person p2 = new Person(e,i); //생략 가능
        p2.<EmployeeInfo>printInfo(e);
        p2.printInfo(e); //생략 가능
        p2.printInfo(10);

        //제네릭의 제한
        PersonExtends<EmployeeInfo> pe = new PersonExtends(new EmployeeInfo(1));
        //PersonExtends<String> pes = new PersonExtends<String>("부장");
        System.out.println(pe.info.getLevel());

    }
}
