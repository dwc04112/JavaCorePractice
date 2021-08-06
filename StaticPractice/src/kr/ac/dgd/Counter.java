package kr.ac.dgd;

public class Counter {
    static int count = 0;   //인스턴스 끼리 공유가된다
    int score = 99;         //인스턴스 변수 , 인스턴스(생성자)호출해야 쓸수있다
    Counter() {
        count++;
        System.out.println(count);
    }
    public static int getCount(){
        //   score = 33;   // static메소드에서 인스턴스 변수를 쓸 수 없다
        return count;
    }
    public int getScore(){  //인스턴스 메소드에서 인스턴스 변수를 쓸 수 있다
        score = 33; //인스턴스 메소드에서 static 멤버 변수 쓸 수 있다
        return score;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter(); //인스턴스
        Counter c2 = new Counter();
    }
}
