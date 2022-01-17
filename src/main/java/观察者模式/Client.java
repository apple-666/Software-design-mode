package 观察者模式;

/**
 * @Author Double_apple
 * @Date 2022/1/18 3:41
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentCondition currentCondition = new CurrentCondition();

        //注册（添加）观察者
        weatherData.registerObsever(currentCondition);

        weatherData.setData(37);
        weatherData.removeObserver(currentCondition);
    }
}
