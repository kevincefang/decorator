package decorator.demo2;

import java.math.BigDecimal;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public class CouponDecorator extends BaseAbstractPriceDecorator {

    public CouponDecorator(IBasePrice price) {
        super(price);
    }

    public BigDecimal calculatePrice(OrderDetail orderDetail) {
        super.calculatePrice(orderDetail);
        BigDecimal payTotalMoney = calculateCouponPayMoney(orderDetail);
        return payTotalMoney;
    }

    private BigDecimal calculateCouponPayMoney(OrderDetail orderDetail) {
        BigDecimal coupon = orderDetail.getGoods().getSupportPromotions().get(PromotionType.COUPON).getUserCoupon().getCoupon();
        System.out.println("优惠券金额：" + coupon);
        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(coupon));
        return orderDetail.getPayMoney();
    }


}
