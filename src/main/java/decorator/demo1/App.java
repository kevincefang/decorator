package main.java.decorator.demo1;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public class App {

    public static void main(String[] args) {
        IDecorator decorator = new Decorator();
        IDecorator curtainDecorator = new CurtainDecorator(decorator);
        curtainDecorator.decorate();
    }
}
