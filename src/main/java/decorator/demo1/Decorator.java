package main.java.decorator.demo1;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 装修基本类
 */
public class Decorator implements IDecorator{


    /**
     * 基本实现方法
     */
    @Override
    public void decorate() {
        System.out.println("水电装修、天花板装修。。。");
    }
}
