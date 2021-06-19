package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class ExSet {
    public static void main(String[] args) {
//        HashSet<Integer> A = new HashSet<>();
//        A.add(1);
//        A.add(2);
//        A.add(2); //중복이 안됨
//        A.add(2); //중복이 안됨
//        A.add(3);
//        Iterator hi = (Iterator) A.iterator();
//        while(hi.hasNext()){
//            System.out.println(hi.next());
//        }
//
//        ArrayList<Integer> B = new ArrayList<>();
//        B.add(1);
//        B.add(2);
//        B.add(2); //중복이 안됨
//        B.add(2); //중복이 안됨
//        B.add(3);
//
//        Iterator hi2 = (Iterator) B.iterator();
//        while(hi2.hasNext()){
//            System.out.println(hi2.next());
//        }

        HashSet<Integer> A = new HashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); //false - A에 B가 전체가 담겨 있는지 확인 - 부분집합(subset)이 아니다
        System.out.println(A.containsAll(C)); //true - A에 C가 전체가 담겨 있는지 확인 - 부분집합(subset)이다

        //A.addAll(B); //A에 B전체를 포함시킨다 - 합집합
        //A.retainAll(B); //A와 B에도 있는 값 - 교집합
        //A.removeAll(B); //A에 B값을 없앤것 - 차집합

        Iterator it = A.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
