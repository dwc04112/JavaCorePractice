package kr.ac.daegu.ysy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //p174 : AirCon 객체 사용 예시
        AirCon airCon = new AirCon();
        AirCon airCon2 = new AirCon();
        //new AirCon인 AirCon파일내용이 AirCon객체인 airCon변수

        //변수 사용
        airCon.color = "white";
        airCon.temp = 10;
        airCon.price = 10000;

        airCon2.color = "red";
        airCon2.temp = 20;
        airCon2.price = 5000;

        //메소드 사용
        airCon.upTemp();
        System.out.println("airCon.temp = " +airCon.temp+ ", airCon.color = "
                +airCon.color + ", airCon.price = " + airCon.price + "원");
        airCon.onPower();
        airCon.offPower();
        airCon.downTemp();
        System.out.println("airCon.temp = " +airCon.temp+ ", airCon.color = "
                +airCon.color + ", airCon.price = " + airCon.price + "원");

        System.out.println(airCon.size);
        airCon.size=15;
        System.out.println(airCon.size);


        System.out.println("\n===============\n"); // \n : Line Feed + Carriage Retrun(엔터)

        //메소드 (airCon2 객체가 가진 기능 사용
        airCon2.upTemp();
        System.out.println("airCon2.temp = " +airCon2.temp+ ", airCon2.color = "
                +airCon2.color + ", airCon2.price = " + airCon2.price + "원");
        airCon2.onPower();
        airCon2.offPower();
        airCon2.downTemp();
        System.out.println("airCon2.temp = " +airCon2.temp+ ", airCon2.color = "
                +airCon2.color + ", airCon2.price = " + airCon2.price + "원");
        System.out.println(airCon.size);

        List<AirCon> airConList = new ArrayList<>();
        airConList.add(airCon);
        airConList.add(airCon2);
        airConList.add(new AirCon("samsung","black", 15000, 10, 12));
        //생정자 파라미터에서 설정한 값 p 198 참고
    }
}
