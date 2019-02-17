package com.ruoyi.ach.domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotBlank;

@ApiModel("意向金确认提交")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ConfirmOfflinePrepay  {

    @ApiModelProperty( "用户id")
    @NotBlank(message = "用户id未填写")
    private String user_id;

    @ApiModelProperty( "订单ID")
    @NotBlank(message = "订单ID未填写")
    private String order_id;

    @ApiModelProperty("凭证图片地址")
    private String voucher_url;
    @ApiModelProperty("凭证号")
    private String voucher_no;


}
