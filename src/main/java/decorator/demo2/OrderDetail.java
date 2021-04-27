package decorator.demo2;

import java.math.BigDecimal;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 订单详情
 */
public class OrderDetail {

    private Long id;

    private Long orderId;

    private Goods goods; //商品详情

    private BigDecimal payMoney; //支付单价

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }
}
