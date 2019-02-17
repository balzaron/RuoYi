package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import lombok.*;

@ApiModel("确认绑卡V2")
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Bindings {

    @ApiModelProperty("用户ID")
    @NotBlank(message = "用户ID未填写")
    private String user_id;

    @ApiModelProperty(value = "银行卡号", required = true)
    @NotBlank(message = "银行卡号未填写")
    @Digits(integer = Integer.MAX_VALUE, fraction = 0, message = "卡号不是纯数字, 请检查是否有空格")
    private String card_no;

    @ApiModelProperty(value = "预留手机号", required = true)
    @NotBlank(message = "预留手机号未填写")
    private String mobile;

    @ApiModelProperty(value = "验证码", required = true)
    @NotBlank(message = "验证码未填写")
    private String captcha;

    @ApiModelProperty(value = "附件", required = true)
    @NotBlank(message = "附件未填写")
    private List<AttachmentV2> attachments;
}
