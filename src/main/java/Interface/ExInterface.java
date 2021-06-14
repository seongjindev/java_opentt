package Interface;

public class ExInterface {
    public static void main(String[] args){
        InterfaceImp ii = new InterfaceImp();
        System.out.println(ii.sum());
        ii.info();

        InterfaceTest[] it = new InterfaceTest[2];
        it[0] = new InterfaceImp();
        it[1] = new InterfaceImp2();



    }


}
