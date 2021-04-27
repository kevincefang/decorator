package decorator.demo2;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: kevin
 * @Date: 2021/4/23
 * @description: 订单
 */
public class Order {

    private Long id; //订单ID
    private String orderNo; //订单号
    private BigDecimal totalPayMoney; //总支付金额
    private List<OrderDetail> orderDetailList; //详细订单列表

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getTotalPayMoney() {
        return totalPayMoney;
    }

    public void setTotalPayMoney(BigDecimal totalPayMoney) {
        this.totalPayMoney = totalPayMoney;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
