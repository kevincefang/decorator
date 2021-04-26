package main.java.decorator.demo2;

import java.math.BigDecimal;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 计算价格
 */
public interface IBasePrice {

    BigDecimal calculatePrice(OrderDetail orderDetail);
}
