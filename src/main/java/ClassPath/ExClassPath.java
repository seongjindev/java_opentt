package ClassPath;

import ClassMInstanceM.Calcu;

class Item {
    public Item() {
        System.out.println("Item");
    }
    public void printItem() {
        System.out.println("Item-printItem");
    }
}

public class ExClassPath { //클래스파일이 ExClassPath.class와 Item.class 두개가 생김
    public static void main(String[] args){
        Item ie = new Item();
        ie.printItem();
        Calcu cc = new Calcu();
    }
}
