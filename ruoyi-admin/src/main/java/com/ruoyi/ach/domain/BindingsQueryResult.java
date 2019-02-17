package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@ApiModel("绑定的银行卡列表")
@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class BindingsQueryResult {

    @ApiModelProperty("银行卡列表")
    private List<BindingCard> card_list;
}
