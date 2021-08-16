package kr.ac.daegu.ysy;

public class Member {
    //db table에 담긴 row 1줄
    //
    private String name;
    private int height;
    private int weight;
    private String nation;
    //member class 안에서만 호출가능

    //4개를 받는 멤버
    public Member(String name, int height, int weight, String nation) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nation = nation;
    }
    @Override
    public String toString(){
        return "이름 : "+name
                +" || 몸무게 : "+weight
                +" || 키 : "+height
                +" || 국적 : "+nation;
    }
    public String getName() {//get set 메소드를 통해서 private 해당 변수에 접근
        return name;
    }
    //set이 없으면 가져오는 것만 가능
    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }




}

