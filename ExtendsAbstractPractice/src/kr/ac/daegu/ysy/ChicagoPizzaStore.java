package kr.ac.daegu.ysy;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
        pizza = new ChicagoStyleCheesePizza();
        }
        /*
        if(type.equals("pepper")) {
        pizza = new ChicagoStylePepperoniPizza();
        }
        if(type.equals("clam")) {
        pizza = new ChicagoStyleClamPizza();
        }
        if(type.equals("veggie")) {
        pizza = new ChicagoStyleVeggiePizza();
        }

         */
        return pizza;
    }
}
