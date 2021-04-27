package decorator.demo2;

import java.math.BigDecimal;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 计算价格抽象类
 */
public abstract class BaseAbstractPriceDecorator implements IBasePrice {

    private IBasePrice priceDecorator;

    public BaseAbstractPriceDecorator(IBasePrice price) {
        this.priceDecorator = price;
    }

    public BigDecimal calculatePrice(OrderDetail orderDetail){
        BigDecimal payTotalMoney = new BigDecimal(0);
        if(priceDecorator != null) {
            payTotalMoney = priceDecorator.calculatePrice(orderDetail);
        }
        return payTotalMoney;
    }
}
