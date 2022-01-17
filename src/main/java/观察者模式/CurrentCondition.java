package 观察者模式;

/**
 * @Author Double_apple
 * @Date 2022/1/18 3:27
 * @Version 1.0
 */
public class CurrentCondition implements Observe{

    private int temperature;

    public void update(int t){
        this.temperature = t;
        show();
    }

    public void show(){
        System.out.println("当前温度是："+temperature);
    }
}
