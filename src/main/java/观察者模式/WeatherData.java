package 观察者模式;

import java.util.ArrayList;

/**
 * @Author Double_apple
 * @Date 2022/1/18 3:33
 * @Version 1.0
 */
public class WeatherData implements Subject {

    private int temperature;

    //观察者集合
    private ArrayList<Observe> observes;

    public WeatherData() {
        observes = new ArrayList<Observe>();
    }

    public void changeData(){
        notifyObserver();
    }

    public void setData(int temperature){
        this.temperature = temperature;
        changeData();
    }

    public void registerObsever(Observe ob) {
        observes.add(ob);
    }

    public void removeObserver(Observe ob) {
        if(observes.contains(ob)) observes.remove(ob);
    }

    // 更新（通知）观察者有new Data
    public void notifyObserver() {
        for(int i = 0; i < observes.size(); i++){
            observes.get(i).update(temperature);
        }
    }
}
