package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@ApiModel("订单")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Order {

    @ApiModelProperty("订单号")
    private String order_id;
    @ApiModelProperty("订单状态: " +
            "1 - 初始化, " +
            "2 - 审核中, " +
            "7 - 审核待补件, " +
            "8 - 审核驳回, " +
            "9 - 审核通过, " +
            "98 - 放款失败, " +
            "99 - 放款成功, " +
            "100 - 还款完成, " +
            "300 - 代偿完成")
    private Integer status;
    @ApiModelProperty("总期数")
    private Integer periods;
    @ApiModelProperty("借款订单金额, 单位: 元")
    private String amount;
    @ApiModelProperty("交强险, 单位: 元")
    private BigDecimal forced_amount;
    @ApiModelProperty("车船税, 单位: 元")
    private BigDecimal vehicle_vessel_tax;

    @ApiModelProperty("意向金金额, 单位: 元")
    private Prepay pre_pay;
    @ApiModelProperty("还款计划")
    private List<RepaymentPlan> repayment_plan;
}