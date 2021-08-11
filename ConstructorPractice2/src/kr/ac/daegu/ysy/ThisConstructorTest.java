package kr.ac.daegu.ysy;

public class ThisConstructorTest {

    public static void main(String[] args) {
        System.out.println("ConstructorPractice2");
        // p 201 ~ 202p
        //다섯개 house인스턴스 생성
        //this라는 이름으로 묶어서
        House house1 = new House();
        printHouse(house1); // house의 멤버변수들 값을 출력하는 메소드.
        //price 300만 넣고 나머지는 house 값
        House house2 = new House(300);
        printHouse(house2);

        House house3 = new House(300, 40);
        printHouse(house3);

        House house4 = new House(300, 40, "서초동");
        printHouse(house4);

        House house5 = new House(300, 40, "서초동" , "빌라");
        printHouse(house5);
    }
    //파라미터로 House 기능에 house인자를 넣어서
    private static void printHouse(House house) {
        System.out.println(house.toString());
    }
}
