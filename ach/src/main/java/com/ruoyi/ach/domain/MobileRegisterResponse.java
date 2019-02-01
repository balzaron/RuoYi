package com.ruoyi.ach.domain;

import lombok.Data;

/**
 * @author: shanyue.gao
 * @date: 2019/2/1 下午3:16
 */
@Data
public class MobileRegisterResponse {

    private String code;
    private Content content;

    @Data
    private class Content {
        private String status;
    }
}
