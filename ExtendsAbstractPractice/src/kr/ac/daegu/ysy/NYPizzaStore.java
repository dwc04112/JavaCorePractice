package kr.ac.daegu.ysy;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleChessePizza();
        }
        /*
        if(type.equalse("pepper")){
            pizza = new NYStylePepperoniPizza();
        }
        if(type.equals("clam")){
            pizza = new NYstyleClamPizza();
        }
        if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }

         */
        return pizza;
    }
}
