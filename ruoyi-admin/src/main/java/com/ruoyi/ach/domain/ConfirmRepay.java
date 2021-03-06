package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotEmpty;

@ApiModel("还款确认提交")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ConfirmRepay {

    @ApiModelProperty(value = "用户id",required = true)
    @NotBlank(message = "用户id未填写")
    private String user_id;

    @ApiModelProperty(value = "订单ID",required = true)
    @NotEmpty(message = "订单ID未填写")
    private String order_id;

    @ApiModelProperty("凭证图片地址")
    private String voucher_url;
    @ApiModelProperty("凭证号")
    private String voucher_no;

    @ApiModelProperty(value = "还款期数（意向金还款无需填写）",required = true)
    private List<Integer> periods;

}
