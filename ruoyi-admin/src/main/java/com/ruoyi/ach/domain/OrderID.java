package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@ApiModel("订单ID")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class OrderID {

    @ApiModelProperty("订单号")
    @NotNull(message = "订单号未填写")
    private String order_id;
}
