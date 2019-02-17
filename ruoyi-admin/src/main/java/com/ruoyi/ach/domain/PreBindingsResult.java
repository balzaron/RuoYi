package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PreBindingsResult {
    @ApiModelProperty(value = "1:验证码发送成功\n" +
            "2:验证码发送失败", required = true)
    private String status;
}
