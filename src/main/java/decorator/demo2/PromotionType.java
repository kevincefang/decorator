package decorator.demo2;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description:
 */
public enum PromotionType {

    COUPON(1,"优惠券"),
    READ_PACKET(2,"红包券");

    private int type;
    private String name;

    PromotionType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
