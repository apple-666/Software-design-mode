package 单例模式.饿汉式静态变量;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:05
 * @Version 1.0
 */

public class Singleton1 {
    public static void main(String[] args) {
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        if(single1 == single2) System.out.println("same");
        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
    }

}

class Single{

    private Single(){}

    private final static Single instance = new Single();

    public static Single getInstance(){
        return  instance;
    }
}
