//package com.ruoyi.ach.domain;
//
//import com.sdxd.common.web.vo.RestRequest;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.util.List;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import org.hibernate.validator.constraints.NotEmpty;
//
//@ApiModel("意向金支付")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class Repay ext {
//
//    @ApiModelProperty("申请ID")
//    @NotEmpty(message = "申请ID未填写")
//    private String applyId;
//
//    @ApiModelProperty("凭证图片地址")
//    private String voucherUrl;
//    @ApiModelProperty("凭证号")
//    private String voucherNo;
//
//    @ApiModelProperty("还款期数（意向金还款无需填写）")
//    private List<Integer> stages;
//}
