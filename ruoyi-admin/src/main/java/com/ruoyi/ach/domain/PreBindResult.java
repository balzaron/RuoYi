package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ApiModel("预绑卡结果")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class PreBindResult {

    @ApiModelProperty("接收状态: 1 - 验证码发送成功, 2 - 验证码发送失败")
    private Integer status;
}
