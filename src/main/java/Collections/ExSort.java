package Collections;

import java.util.*;

class Computer implements Comparable{ //정렬이 필요할때 Comparable를 이용해야함
    int serial;
    String owner;

    public Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object o){ //구현하도록 강제
        return this.serial - ((Computer)o).serial;
    }
    public String toString(){
        return serial+" "+owner;
    }
}

public class ExSort {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500,"hello"));
        computers.add(new Computer(200,"java"));
        computers.add(new Computer(123,"world"));
        Iterator i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(computers); //Collection와 다르다
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
