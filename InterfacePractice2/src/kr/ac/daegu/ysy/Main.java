package kr.ac.daegu.ysy;

import java.util.ArrayList;
import java.util.List;
/*
import kr.ac.daegu.ysy.Coffe.Coffee;
import kr.ac.daegu.ysy.Coffe.MyStyleCoffee;


 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Coffee> coffees = new ArrayList<>();
            coffees.add(new MyStyleCoffee("arabica", "ice"));
            coffees.add(new MyStyleCoffee("ethiopian", "hot"));
            coffees.add(new shopStyleCoffee("좋은콩", 80));

            for (Coffee c : coffees){
                c.coffeeOrder();
            }
    }
}

interface Coffee {
    void coffeeOrder();
}


class MyStyleCoffee implements Coffee {
    private String beans;
    private String temp;

    public MyStyleCoffee(String beans, String temp) {
        this.beans = beans;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "MyStyleCoffee{" +
                "beans='" + beans + '\'' +
                ", temp='" + temp + '\'' +
                '}';
    }

    @Override
    public void coffeeOrder() {
        String order = toString();
        System.out.println(order);
    }

}

class shopStyleCoffee implements Coffee{
    String beans;
    int temp;

    public shopStyleCoffee(String beans, int temp){
        this.beans =beans;
        this.temp = temp;
    }

    @Override
    public void coffeeOrder() {
        System.out.println("커피 콩 = "+beans+ " || 온도 = " + temp + "도");
    }
}



