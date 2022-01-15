package 单例模式.懒汉式静态方法线程不安全;

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

    //只有用到了创建方法才创建实例 即为懒汉
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }



}