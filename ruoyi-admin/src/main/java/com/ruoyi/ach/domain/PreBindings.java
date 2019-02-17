package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PreBindings {
    @NotBlank(message = "用户 id 不能为空")
    @ApiModelProperty("用户申请返回的用户标示")
    private String user_id;

    @NotBlank(message = "card_no不可为空")
    @ApiModelProperty(value = "银行卡号", required = true)
    private String card_no;

    @NotBlank(message = "手机号不可为空")
    @ApiModelProperty(value = "银行预留号", required = true)
    private String mobile;

    @NotBlank(message = "身份证号不可为空")
    @ApiModelProperty(value = "银行所留身份证", required = true)
    private String id_card;

    @NotBlank(message = "真实姓名不可为空")
    @ApiModelProperty(value = "姓名", required = true)
    private String name;
}
