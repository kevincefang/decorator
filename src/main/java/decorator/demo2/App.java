package decorator.demo2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public class App {

    public static void main(String[] args) {
        Order order = new Order();
        init(order);
        for(OrderDetail orderDetail: order.getOrderDetailList()) {
            BigDecimal payMoney = PromotionFactory.getPayMoney(orderDetail);
            orderDetail.setPayMoney(payMoney);
            System.out.println("最终支付金额：" + orderDetail.getPayMoney());
        }
    }

    private static Order init(Order order) {
        Map<PromotionType, SupportPromotions> supportPromotionslist = new HashMap<>();

        SupportPromotions supportPromotions = new SupportPromotions();
        supportPromotions.setPromotionType(PromotionType.COUPON);
        supportPromotions.setPriority(1);

        UserCoupon userCoupon= new UserCoupon();
        userCoupon.setCoupon(new BigDecimal(3));
        userCoupon.setSku("aaa1111");
        userCoupon.setUserId(11);

        supportPromotions.setUserCoupon(userCoupon);

        supportPromotionslist.put(PromotionType.COUPON, supportPromotions);
        SupportPromotions supportPromotions1 = supportPromotions.clone();
        System.out.println(supportPromotions1);

        supportPromotions1.setPromotionType(PromotionType.READ_PACKET);
        supportPromotions1.setPriority(2);

        UserRedPacket userRedPacket= new UserRedPacket();
        userRedPacket.setId(1);
        userRedPacket.setRedPacket(new BigDecimal(10));
        userRedPacket.setSku("aaa1111");
        userCoupon.setUserId(11);

        supportPromotions1.setUserRedPacket(userRedPacket);
        supportPromotionslist.put(PromotionType.READ_PACKET, supportPromotions1);

        Goods goods = new Goods();
        goods.setSku("aaa1111");
        goods.setName("苹果");
        goods.setPrice(new BigDecimal(20));
        goods.setSupportPromotions(supportPromotionslist);

        List<OrderDetail> OrderDetailList = new ArrayList<>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(1L);
        orderDetail.setOrderId(1111L);
        orderDetail.setGoods(goods);

        OrderDetailList.add(orderDetail);

        order.setOrderDetailList(OrderDetailList);

        return order;

    }
}
