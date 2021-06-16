package ConstantEnum;

interface FRUIT{
    int APPLE = 1, PEACH = 2, BANANA=3;
}
interface COMPANY{
    int GOOGLE = 1, APPLE =2, ORACLE =3;
}

//class Fruit{
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit PEACH = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow"); //public static final Fruit APPLE = new Fruit();와 동일
    private String color; //enum은 클래스이기 때문에 변수를 가질 수 있다, 변경할 수 있으므로 private로 변경
    public String getColor(){ //enum은 클래스이기 때문에 메소드를 가질 수 있다
        return this.color;
    }
    Fruit(String color) { //enum은 클래스이기 때문에 생성자를 가질 수 있다
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
}
//class Company{
//    public static final Company GOOGLE = new Company();
//    public static final Company APPLE = new Company();
//    public static final Company ORACLE = new Company();
//}
enum Company{
    GOOGLE, APPLE, ORACLE;
}

public class ExConstantEnum {
    private static final int FRUIT_APPLE = 1; //전역변수, final 바뀌지않는값, static 클래스 변수
    private static final int FRUIT_PEACH = 2;
    private static final int FRUIT_BANANA = 3;

    private static final int COMPANY_GOOGLE = 1;
    private static final int COMPANY_APPLE = 2; //중복선언됨
    private static final int COMPANY_ORACLE = 3;

    public static void main(String[] args){
        int x = 1; //좌항이 변수이고 우항이 상수이다
//      1.사과 2.복숭아 3.바나나
        int type =1;
        switch(type){
            case 1:
                System.out.println(57);
                break;
            case 2:
                System.out.println(34);
                break;
            case 3:
                System.out.println(93);
                break;
        }
        System.out.println("클래스변수 활용");
        //클래스변수 활용
        int type2 = FRUIT_APPLE;
        switch(type2){
            case FRUIT_APPLE: //주석이없어도 이해를 할 수 있음
                System.out.println(57+"kcal");
                break;
            case FRUIT_PEACH:
                System.out.println(34+"kcal");
                break;
            case FRUIT_BANANA:
                System.out.println(93+"kacl");
                break;
        }
        System.out.println("인터페이스 활용");
        //인터페이스 활용
        int type3 = FRUIT.APPLE;
        switch(type3){
            case FRUIT.APPLE: //주석이없어도 이해를 할 수 있음
                System.out.println(57+"kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34+"kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93+"kacl");
                break;
        }

        if(FRUIT.APPLE == COMPANY.APPLE){
            System.out.println("과일애플과 기업애플과 같다");
        }
        //System.out.println("클래스 활용");
        //새로운 클래스를 만듦
        //Fruit type4 = Fruit.APPLE;
//        switch(type4){ //데이터 타입이 안맞음
//            case Fruit.APPLE: //주석이없어도 이해를 할 수 있음
//                System.out.println(57+"kcal");
//                break;
//            case Fruit.PEACH:
//                System.out.println(34+"kcal");
//                break;
//            case Fruit.BANANA:
//                System.out.println(93+"kacl");
//                break;
//        }

//        if(Fruit.APPLE == Company.APPLE){ //다른 클래스이기때문에 비교할수없음
//            System.out.println("과일애플과 기업애플과 같다");
//        }
        System.out.println("enum활용");
        Fruit type4 = Fruit.APPLE;
        switch(type4){
            case APPLE:
                System.out.println(57+"kcal, color "+ Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+"kcal, color "+ Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+"kacl, color "+ Fruit.BANANA.getColor());
                break;
        }
        System.out.println(type4.getColor());
        System.out.println("values");
        for(Fruit f : Fruit.values()){ //상수를 가지고 있는 배열과 비슷, 마치 배열 비슷하게 사용도 할 수 있음
            System.out.println(f);
        }


    }
}
