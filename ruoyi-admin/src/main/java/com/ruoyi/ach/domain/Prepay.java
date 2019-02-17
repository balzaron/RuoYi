package com.ruoyi.ach.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Prepay {

    @NotBlank(message = "order id 不能为空")
    private String order_id;

    @NotBlank(message = "金额不能为空")
    private String amount;

    @NotBlank(message = "30-待付\n" +
            "77- 失效\n" +
            "89-付款成功")
    private Integer status;
}
