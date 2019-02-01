package com.ruoyi.ach.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: shanyue.gao
 * @date: 2019/2/1 下午3:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MobileRegisterRequest {
    private String phone;
    private String type;
}
