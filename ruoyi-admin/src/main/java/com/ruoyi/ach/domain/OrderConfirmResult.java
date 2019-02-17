package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderConfirmResult {
    @NotBlank
    @ApiModelProperty("1:确认成功\n" +
            "2:确认失败")
    private String status;
}
