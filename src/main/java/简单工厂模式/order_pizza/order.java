package 简单工厂模式.order_pizza;

import 简单工厂模式.allpizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Double_apple
 * @Date 2022/1/12 23:48
 * @Version 1.0
 */
public class order {

    //定义一个简单工厂对象
    SimpleFactory simpleFactory; Pizza pizza = null;
    //构造器
    public order(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }
    //设置工厂
    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = ""; //用户输入的
        this.simpleFactory = simpleFactory; //设置简单工厂对象
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出 pizza
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }while (true);
    }



    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in)); 	System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

