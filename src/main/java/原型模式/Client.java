package 原型模式;

/**
 * @Author Double_apple
 * @Date 2022/1/15 16:57
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep(12,true);
        Sheep sheep1 = (Sheep)sheep.clone();
        System.out.println("sheep:"+sheep.toString());
        System.out.println("sheep1:"+sheep1.toString());
        System.out.print("两个对象是否相同：");
        System.out.println(sheep==sheep1);
    }
}
