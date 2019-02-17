package com.ruoyi.ach.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequest {
    private String phone;
    private Integer type;

}
