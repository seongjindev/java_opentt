package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExMap {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        a.put("oneone",1);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));


    }
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }
    }
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String,Integer> entry = i.next();
            System.out.println(entry.getKey()+" + "+entry.getValue());
        }
    }

}
