package main.java.decorator.demo2;

import java.math.BigDecimal;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public class BasePrice implements IBasePrice{


    @Override
    public BigDecimal calculatePrice(OrderDetail orderDetail) {
        orderDetail.setPayMoney(orderDetail.getGoods().getPrice());
        System.out.println("商品原单价金额为：" + orderDetail.getPayMoney());
        return orderDetail.getPayMoney();
    }
}
