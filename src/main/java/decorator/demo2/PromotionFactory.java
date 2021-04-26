package main.java.decorator.demo2;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public class PromotionFactory {

    public static BigDecimal getPayMoney(OrderDetail orderDetail) {
        IBasePrice basePrice = new BasePrice();
        Map<PromotionType,SupportPromotions> promotionsMap = orderDetail.getGoods().getSupportPromotions();
        if (promotionsMap != null && promotionsMap.size() > 0){
           for (PromotionType promotionType : promotionsMap.keySet()){
                if (PromotionType.COUPON == promotionsMap.get(promotionType).getPromotionType()){
                    basePrice = new CouponDecorator(basePrice);
                }
                else if (PromotionType.READ_PACKET == promotionsMap.get(promotionType).getPromotionType()){
                    basePrice = new RedPacketDecorator(basePrice);
                }
           }
        }
        return basePrice.calculatePrice(orderDetail);
    }




}
