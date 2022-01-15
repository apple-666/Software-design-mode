package 原型模式;


/**
 * @Author Double_apple
 * @Date 2022/1/15 16:53
 * @Version 1.0
 */
public class Sheep implements Cloneable{

    private int age;

    private boolean sex;

    public  Sheep(int age, boolean sex) {
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
