package Polymorphism;
interface Father{
}
interface CarCleaning{
    void cleaning();
}
interface Programmer{
    void coding();
}
class Tom implements Father,CarCleaning,Programmer{
    @Override
    public void coding() {
        System.out.println("coding");
    }
    @Override
    public void cleaning() {
        System.out.println("car cleaning");
    }
}

public class Workspace {
    public static void main(String[] args){
        Programmer emp = new Tom();
        emp.coding();
        //emp.cleaning();
    }
}
