package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ApiModel("还款计划")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentPlan {

    @ApiModelProperty("订单号")
    private String order_id;
    @ApiModelProperty("状态: 1 - 待还款,2 - 已还款")
    private Byte status;
    @ApiModelProperty("第几期")
    private Integer period;
    @ApiModelProperty("当期本金, 单位: 元")
    private String capital;
    @ApiModelProperty("当期利息, 单位: 元")
    private String interest;
    @ApiModelProperty("当期服务费, 单位: 元")
    private String fee;
    @ApiModelProperty("当期应还总金额, 单位: 元")
    private String amount;
    @ApiModelProperty("当期实际还款总金额, 单位: 元")
    private String repay_amount;
    @ApiModelProperty("当期已还本金, 单位: 元")
    private String repay_capital;
    @ApiModelProperty("当期已还利息, 单位: 元")
    private String repay_interest;
    @ApiModelProperty("当期已还服务费, 单位: 元")
    private String repay_fee;
    @ApiModelProperty("期初")
    private Date start_date;
    @ApiModelProperty("期末")
    private Date end_date;
    @ApiModelProperty("应还款日期")
    private Date repay_time;
    @ApiModelProperty("实际还款日期")
    private Date actual_repay_time;
    @ApiModelProperty("逾期天数, 默认0天")
    private Long overdue_days;
    @ApiModelProperty("逾期罚息, 单位: 元")
    private String overdue_interest;
    @ApiModelProperty("逾期服务费, 单位: 元")
    private String overdue_fee;
    @ApiModelProperty("逾期状态, 0-未逾期,1-已逾期")
    private String overdue_status;
    @ApiModelProperty("已还罚息, 单位: 元")
    private String repay_overdue_interest;
    @ApiModelProperty("已还逾期服务费, 单位: 元")
    private String repay_overdue_fee;

    public String getOverdue_status() {
        if(getOverdue_days()!=null&&getOverdue_days()>0) {
            return "1";
        }else{
            return "0";
        }
    }
}
