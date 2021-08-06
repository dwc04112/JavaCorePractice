package kr.ac.daegu.ysy;

public class PizzaTestDrive {

    public static void main(String[] args) {
	// write your code here
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza nyStylePizza = nyStore.orderPizza("cheese");
        System.out.println(nyStylePizza.getName());
        System.out.println("-----------------------------------------");
        Pizza chicagoStylePizza = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoStylePizza.getName());
    }
}
