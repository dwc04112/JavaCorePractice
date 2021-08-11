package kr.ac.daegu.ysy;

public class Main {
    public static void main(String[] args) {
        // p205
        //4개 인자를 집어넣어줘야한다
        Member member1 = new Member("name",180,70,"korea");
        //member 안에 값을 쓰고싶다 하면 get
        System.out.println(member1.getName());
        System.out.println(member1.getHeight());
        System.out.println(member1.getWeight());
        System.out.println(member1.getNation());
        //member1.name; //<-- 갖다쓰는 사람의 실수를 방지하기 위해 (데이터 무결성을 위해서)
        //데이터 무결(결함)성 : 조작되지 않은 확실한 데이터이다.
        //데이터를 조작하는 일 없이 쓰기위해서 get
    }
}
