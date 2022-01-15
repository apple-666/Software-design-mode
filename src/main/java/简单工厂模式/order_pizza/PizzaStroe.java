package 简单工厂模式.order_pizza;

/**
 * @Author Double_apple
 * @Date 2022/1/13 0:02
 * @Version 1.0
 */
public class PizzaStroe {
    public static void main(String[] args) {
        new order(new SimpleFactory());
        System.out.println("买好了");
        System.out.println("有的话 ");

    }
}
