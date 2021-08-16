package kr.ac.daegu.ysy;

public class Main {
    public static void main(String[] args) {
        // p205
        //4개 인자를 집어넣어줘야한다
        Member m1 = new Member("name",180,70,"korea");
        Member2 m2 = new Member2("이름", 170,60,"korea");
        //member 안에 값을 쓰고싶다 하면 get
        System.out.println(m1);
        System.out.println(m2);
        //재정의한 toString을 사용하지 않으면 아래 출력처럼 주소와 해시코드가 나온다
        System.out.println(m2.name);
        //m2 는 private를 하지않아서 그냥 name을 가져올수 있지만
        //m1 은 private를 사용하여서 name을 가져오려면
        //get set 메소드를 통해서 private 해당 변수에 접근

        System.out.println(m1.getName());
        System.out.println(m1.getHeight());
        System.out.println(m1.getWeight());
        System.out.println(m1.getNation());


        //member1.name; //<-- 갖다쓰는 사람의 실수를 방지하기 위해 (데이터 무결성을 위해서)
        //데이터 무결(결함)성 : 조작되지 않은 확실한 데이터이다.
        //데이터를 조작하는 일 없이 쓰기위해서 get
    }
}
