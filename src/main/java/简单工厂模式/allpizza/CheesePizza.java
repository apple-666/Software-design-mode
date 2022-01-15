package 简单工厂模式.allpizza;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:45
 * @Version 1.0
 */
public class CheesePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("为cheesepizza 做准备");
    }
}
