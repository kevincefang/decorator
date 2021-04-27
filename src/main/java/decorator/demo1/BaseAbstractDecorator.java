package decorator.demo1;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 基本装饰类
 */
public abstract class BaseAbstractDecorator implements IDecorator {

    private IDecorator decorator;

    public BaseAbstractDecorator(IDecorator decorator){
        this.decorator = decorator;
    }

    /**
     * 调用装饰方法
     */
    public void decorator(){
        if (decorator != null){
            decorator.decorate();
        }
    }
}
