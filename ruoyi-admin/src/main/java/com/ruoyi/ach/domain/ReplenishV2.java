//package com.ruoyi.ach.domain;
//
//import static com.sdxd.api.vo.insurance.InsuranceErrors.ORDER_ATTACHMENT_ILLEGAL_PHASE;
//import static com.sdxd.api.vo.insurance.InsuranceErrors.ORDER_ATTACHMENT_NO_INSURANCE_ORIGINAL;
//import static com.sdxd.api.vo.insurance.InsuranceErrors.ORDER_ATTACHMENT_PARAM_EMPTY_INSURANCE;
//
//import com.google.common.collect.Lists;
//import com.sdxd.apply.enums.ApplyOrderAttachmentPhase;
//import com.sdxd.apply.enums.ApplyOrderAttachmentType;
//import com.sdxd.apply.request.AttachmentRequestV2;
//import com.sdxd.apply.request.AttachmentInfo;
//import com.sdxd.common.utils.BillNoUtils;
//import com.sdxd.common.web.util.FieldIgnore;
//import com.sdxd.common.web.vo.ErrorCode;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.util.List;
//import javax.validation.constraints.NotNull;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import org.apache.commons.lang3.StringUtils;
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.util.CollectionUtils;
//
//@ApiModel("上传附件V2.0")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class ReplenishV2 {
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
//    private List<AttachmentV2> attachments;
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
//                for(AttachmentV2 attachment:getAttachments()){
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
//
//    public AttachmentRequestV2 createRequest() {
//        AttachmentRequestV2 request = new AttachmentRequestV2();
//        request.setRequestId(BillNoUtils.GenerateBillNo());
//        request.setInsurance(getInsurance());
//        request.setMerchantNo(getMerchantNo());
//        request.setOrderId(getOrder_id());
//        request.setPhase(getPhase());
//        List<AttachmentInfo> attachmentList = Lists.newArrayList();
//        if(!CollectionUtils.isEmpty(getAttachments())){
//            for(AttachmentV2 attachment:getAttachments()){
//                AttachmentInfo attachmentInfo = new AttachmentInfo();
//                attachmentInfo.setType(ApplyOrderAttachmentType.valueOf( attachment.getType()));
//                attachmentInfo.setUrl(attachment.getFile_url());
//                attachmentList.add(attachmentInfo);
//            }
//        }
//        request.setAttachments(attachmentList);
//        return request;
//    }
//
//}
