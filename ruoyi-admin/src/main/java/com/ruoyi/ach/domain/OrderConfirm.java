package com.ruoyi.ach.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderConfirm {
    @NotBlank
    private String order_id;
}
