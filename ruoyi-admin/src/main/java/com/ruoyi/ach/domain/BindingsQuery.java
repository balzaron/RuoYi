package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BindingsQuery {
    @NotBlank
    @ApiModelProperty(name = "用户 ID", required = true)
    private String user_id;
}
