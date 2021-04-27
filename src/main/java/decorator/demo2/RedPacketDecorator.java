package decorator.demo2;

import java.math.BigDecimal;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public class RedPacketDecorator extends BaseAbstractPriceDecorator{

    public RedPacketDecorator(IBasePrice price) {
        super(price);
    }

    public BigDecimal calculatePrice(OrderDetail orderDetail){
        super.calculatePrice(orderDetail);
        BigDecimal payTotalMoney = calculateCouponPayMoney(orderDetail);
        return payTotalMoney;
    }

    private BigDecimal calculateCouponPayMoney(OrderDetail orderDetail) {
        BigDecimal redPacket = orderDetail.getGoods().getSupportPromotions().get(PromotionType.READ_PACKET).getUserRedPacket().getRedPacket();
        System.out.println("红包金额：" + redPacket);
        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(redPacket));
        return orderDetail.getPayMoney();
    }
}
