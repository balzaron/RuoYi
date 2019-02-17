package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ApiModel("申请结果")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ApplyResult {

    @ApiModelProperty("订单号")
    private String order_id;
    @ApiModelProperty("准入单号")
    private String apply_id;
    @ApiModelProperty("用户ID")
    private String user_id;
    @ApiModelProperty("商户保留信息")
    private String reserve;

}