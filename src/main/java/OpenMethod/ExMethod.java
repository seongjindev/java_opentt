package OpenMethod;

public class ExMethod {
    //정의
    public static void numbering(){
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
    //오버로딩
    public static void numbering(int limit){//매개변수 parameter
        int i = 0;
        while(i<limit){
            System.out.println(i);
            i++;
        }
    }
    public static void numbering(int init, int limit){
        int i = init;
        while(i<limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        numbering();//호출
        numbering(5);//인자 argument
        numbering(3,5);
    }
}
