package kr.ac.daegu.ysy;

public class House {
    int price;
    String dong;
    int size;
    String kind;

    public House(){
        //System.out.println("this 보다 앞에서 실행");
        this(100, 32, "상계동", "아파트");
    }
    public House(int price){
        this(price, 32, "상계동", "아파트");
    }
    public House(int price, int size){
        this(price, size, "상계동", "아파트");
    }
    public House(int price, int size, String dong){
        this(price, size, dong, "아파트");
    }

    public House(int price, int size, String dong, String kind){
        this.price = price;
        this.size = size;
        this.dong = dong;
        this.kind = kind;
    }
    //메소드 재정의 : 원래 주어진 메소드의 구현 내용을 다시 정의한다
    //정의 : 구현
    //Object 클래스
    //house 객체에서 toString을 사용하면 아래내용
    //재정의 안하고 사용하면 주소가 출력된다 (toString 원래)
    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", dong='" + dong + '\'' +
                ", size=" + size +
                ", kind='" + kind + '\'' +
                '}';
    }
}
