package 简单工厂模式.allpizza;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:42
 * @Version 1.0
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void make(){
        System.out.println("做面团");
    }

    public void box(){
        System.out.println("打包");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
