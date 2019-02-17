package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ApiModel("绑卡结果")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class BindingsResult {

    @ApiModelProperty("绑卡ID")
    private String bind_id;
}
