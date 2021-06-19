package Collections;

import java.util.ArrayList;

public class ExCollections {
    public static void main(String[] args){
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        //arrayObj[2] = "three"; //오류발생, 배열은 크기 변경 불가능
        for(int i = 0;i<arrayObj.length;i++){
            System.out.println(arrayObj[i]);
        }
        System.out.println("-----");

        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i = 0;i<al.size();i++){
            String value = al.get(i);
            System.out.println(al.get(i));
        }

    }
}
