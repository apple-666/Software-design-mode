package 简单工厂模式.order_pizza;

import 简单工厂模式.allpizza.BHeesePizza;
import 简单工厂模式.allpizza.CheesePizza;
import 简单工厂模式.allpizza.Pizza;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:56
 * @Version 1.0
 */
public class SimpleFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (pizzaType.equals("bheese")){
            pizza = new BHeesePizza();
        }else if (pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
