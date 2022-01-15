package 单例模式.懒汉式线程安全效率低;

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

    private static Singleton instance;

    private Singleton(){}

    //use synchronized  同步但是效率很低
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }



}