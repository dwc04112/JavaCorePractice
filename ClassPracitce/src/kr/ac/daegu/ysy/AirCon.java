package kr.ac.daegu.ysy;

public class AirCon {
    //변수정의
    String company;
    String color;
    int price;
    int size = 10;
    int temp;

    //java 언어 규칙 : 기본 생성자, 인자가 있는 생성자를(밑의 AirCon)
    //만들면 기본생성자는 자동 비활성화 된다.
    public AirCon(){}

    //생성자 (메소드와 같이 생겼지만 생성자의 네미잉은 class 네이밍과 같아야 한다 (대소문자 까지)
    public AirCon(String company, String color, int price, int size, int temp){
        this.company = company; //값을 변수에
        this.color = color;
        this.price = price;
        this.size = size;
        this.temp = temp;
    }

    void onPower(){
        System.out.println("power on");
    }

    void offPower(){
        System.out.println("power off");
    }
    void upTemp(){
        temp++;
    }
    void downTemp(){
        temp--;
    }
}
