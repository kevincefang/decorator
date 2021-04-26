package main.java.decorator.demo1;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 窗帘装饰类
 */
public class CurtainDecorator extends BaseAbstractDecorator{

    public CurtainDecorator(IDecorator decorator) {
        super(decorator);
    }

    @Override
    public void decorate() {
        System.out.println("窗帘装修。。。");
        super.decorator();
    }
}
