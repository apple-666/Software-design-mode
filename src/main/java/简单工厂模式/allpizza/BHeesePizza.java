package 简单工厂模式.allpizza;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:46
 * @Version 1.0
 */
public class BHeesePizza extends Pizza {
    public void prepare() {
        System.out.println("为 BHeesePizza做准备");
    }
}
