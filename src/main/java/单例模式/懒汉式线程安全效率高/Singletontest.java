package 单例模式.懒汉式线程安全效率高;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:23
 * @Version 1.0
 */
public class Singletontest {
    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        if(single1 == single2) System.out.println("same");
        if(single1.equals(single2)) System.out.println("same");
        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
    }
}


class Singleton{

    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)    instance = new Singleton();
            }
        }
        return instance;
    }



}