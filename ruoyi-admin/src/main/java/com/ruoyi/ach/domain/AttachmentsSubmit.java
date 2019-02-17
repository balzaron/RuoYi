package com.ruoyi.ach.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class AttachmentsSubmit {

    @NotBlank(message = "order id 不能为空")
    private String order_id;

    @NotBlank(message = "1.补件 2.上传保单")
    private Integer phase;

    private String insurance;

    private List<AttachmentV2> attachments;

}
