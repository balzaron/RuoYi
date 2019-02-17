//package com.ruoyi.ach.domain;
//
//import com.sdxd.apply.response.ApplyOrderInfo;
//import io.swagger.annotations.ApiModel;
//import java.util.List;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//@ApiModel("订单信息")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class ApplyOrderInfoExt extends ApplyOrderInfo {
//
//    private String prepayId;
//    private BigDecimal preAmount;//意向金
//    private Byte preStatus;//30-待付 77- 失效 89-付款成功
//    private Date endTime;//失效时间
//    private List<RepaymentPlan> plans;
//}
