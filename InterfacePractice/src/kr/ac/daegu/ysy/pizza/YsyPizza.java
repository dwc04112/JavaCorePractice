package kr.ac.daegu.ysy.pizza;

public class YsyPizza implements pizzaBaker{
    private String bread;
    private String ingrediant;
    private int temperature;

    private YsyPizza() {};
    //Ysy 인스턴스 생성할때 기본 생성자를 사용하지 못하도록 조치
    //사실 여기에서 작성할필요x
    //왜냐면 이미 bread ingrediant 인자를 받는 생성자를 만들었기 때문
    //기본생성자는 비활성
    public YsyPizza(String bread, String ingrediant, int temperature){
        this.bread = bread;
        this.ingrediant = ingrediant;
        this.temperature = temperature;
    }





    public String baking() {
        return "YsyPizza스타일 | 고른 빵 : " + bread  +  " | 재료들 :" + ingrediant  +
                " | 선택한 온도 : " + temperature;
    }


    @Override
    public void Pizzadelivery() {
        String info = this.baking();

        System.out.println(info);
        System.out.println("========");
        if(temperature > 150){
            System.out.println("피자가 다 타버렸소");
        }else {
            System.out.println("그럭저럭 피자 완성");
        }


    }
}


