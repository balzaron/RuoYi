//package com.ruoyi.ach.domain;
//
//import static com.sdxd.api.vo.insurance.InsuranceErrors.*;
//
//import com.sdxd.apply.enums.ApplyOrderAttachmentPhase;
//import com.sdxd.apply.enums.ApplyOrderAttachmentType;
//import com.sdxd.common.utils.BillNoUtils;
//import com.sdxd.common.web.util.FieldIgnore;
//import com.sdxd.common.web.vo.ErrorCode;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import org.apache.commons.lang3.StringUtils;
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import javax.validation.constraints.NotNull;
//import java.util.List;
//import org.springframework.util.CollectionUtils;
//
//@ApiModel("上传附件")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//@Document(collection = "T_INSURANCE_INSTALLMENT_ATTACHMENTS")
//public class Replenish {
//
//    @ApiModelProperty("订单号")
//    @NotBlank(message = "订单号未填写")
//    private String order_id;
//    @ApiModelProperty("附件上传阶段: 1 - 补件, 2 - 上传保单")
//    @NotNull(message = "附件上传阶段未填写")
//    private Integer phase;
//    @ApiModelProperty("保单号, 如果phase = 2则此字段为必填保单号")
//    private String insurance;
//
//    @ApiModelProperty("附件列表")
//    @NotNull(message = "附件未填写")
//    private List<Attachment> attachments;
//
//    @FieldIgnore
//    private String batchId;
//
//    @FieldIgnore
//    private String merchantNo;
//
//    public String getBatchId() {
//        if (StringUtils.isBlank(batchId)) {
//            this.batchId = BillNoUtils.GenerateBillNo();
//        }
//        return this.batchId;
//    }
//
//
//    public ErrorCode validate(){
//
//        if(getPhase()==ApplyOrderAttachmentPhase.SUPPLEMENT.getPhase()){
//
//        }else if(getPhase()==ApplyOrderAttachmentPhase.INSURANCE.getPhase()){
//            boolean hasInsuranceOriginal =Boolean.FALSE;
//            if(StringUtils.isBlank(getInsurance())){
//                return ORDER_ATTACHMENT_PARAM_EMPTY_INSURANCE;
//            }
//            if(!CollectionUtils.isEmpty(getAttachments())){
//                for(Attachment attachment:getAttachments()){
//                    switch (ApplyOrderAttachmentType.valueOf(attachment.getType())){
//                        case insurance_original:
//                            hasInsuranceOriginal = Boolean.TRUE;
//                            break;
//                    }
//                }
//            }
//            if(!hasInsuranceOriginal){
//                return ORDER_ATTACHMENT_NO_INSURANCE_ORIGINAL;
//            }
//        }else{
//            return ORDER_ATTACHMENT_ILLEGAL_PHASE;
//        }
//        return null;
//    }
//}
