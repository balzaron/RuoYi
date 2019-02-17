//package com.ruoyi.ach.domain;
//
//
//import com.sdxd.repayment.dubbo.response.RepaymentPrepayResponse;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.ToString;
//
//@ApiModel("意向金")
//@Data
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class PreRepay implements Serializable {
//
//  @ApiModelProperty("订单号")
//  private String order_id;
//  @ApiModelProperty("状态: 30-待付 77- 失效 89-付款成功")
//  private Byte status;
//  @ApiModelProperty("金额, 单位: 元")
//  private BigDecimal amount;
//
//  public PreRepay(RepaymentPrepayResponse prepayResponse) {
//    this.order_id = prepayResponse.getOrderId();
//    this.amount = prepayResponse.getAmount() == null ? BigDecimal.ZERO : prepayResponse.getAmount();
//    this.status = prepayResponse.getStatus();
//  }
//}
