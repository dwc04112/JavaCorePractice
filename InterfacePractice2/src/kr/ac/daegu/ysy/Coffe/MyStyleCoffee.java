package kr.ac.daegu.ysy.Coffe;

public class MyStyleCoffee implements Coffee {
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
