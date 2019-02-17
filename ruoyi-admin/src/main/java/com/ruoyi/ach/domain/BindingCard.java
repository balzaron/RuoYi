package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import static lombok.AccessLevel.PRIVATE;

@ApiModel("绑定的银行卡")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = PRIVATE)
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class BindingCard {

    @ApiModelProperty("绑卡ID")
    private String bind_id;

    @ApiModelProperty("银行卡号")
    private String card_no;

    @ApiModelProperty("银行名称")
    private String bank_name;
}
