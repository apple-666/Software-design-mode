package 观察者模式;

/**
 * @Author Double_apple
 * @Date 2022/1/18 3:32
 * @Version 1.0
 */
public interface Subject {
    public void registerObsever(Observe ob);
    public void removeObserver(Observe ob);
    public void notifyObserver();
}
