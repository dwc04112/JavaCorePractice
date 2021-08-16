package kr.ac.daegu.ysy;

public class Member2 {
    String name;
    int height;
    int weight;
    String nation;
    //member class 안에서만 호출가능

    //4개를 받는 멤버
    public Member2(String name, int height, int weight, String nation) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nation = nation;
    }

}

