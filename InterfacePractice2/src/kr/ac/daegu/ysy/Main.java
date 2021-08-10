package kr.ac.daegu.ysy;

import java.util.ArrayList;
import java.util.List;
import kr.ac.daegu.ysy.Coffe.Coffee;
import kr.ac.daegu.ysy.Coffe.MyStyleCoffee;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Coffee> coffees = new ArrayList<>();
            coffees.add(new MyStyleCoffee("arabica", "ice"));
            coffees.add(new MyStyleCoffee("ethiopian", "hot"));

            for (Coffee c : coffees){
                c.coffeeOrder();
            }
    }
}
