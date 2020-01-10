package io.ilss.transaction.twodatasource.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * order_info
 * @author 
 */
@Data
public class OrderInfoDO implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 账户id
     */
    private Long accountId;

    /**
     * 订单结束标志
     */
    private Integer completed;

    /**
     * 状态0-新订单创建 1-已付款 2-已发货 3-已确认签收付款  -1-订单取消 -2 支付失败 -3 退货  9-订单完成
     */
    private Integer orderState;

    private String detail;

    private BigDecimal amount;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;
}