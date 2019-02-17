//package com.ruoyi.ach.domain;
//
//import com.sdxd.common.web.rest.ContextParam;
//import com.sdxd.common.web.vo.RestRequest;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import org.hibernate.validator.constraints.NotEmpty;
//
//import javax.validation.constraints.Digits;
//
//@ApiModel("预绑卡")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class BankCardPreBinding extends RestRequest {
//
//    @ApiModelProperty("用户ID")
//    @NotEmpty(message = "用户ID未填写")
//    private String user_id;
//
//    @ApiModelProperty(value = "银行卡号", required = true)
//    @NotEmpty(message = "银行卡号未填写")
//    @Digits(integer = Integer.MAX_VALUE, fraction = 0, message = "卡号不是纯数字, 请检查是否有空格")
//    private String card_no;
//
//    @ApiModelProperty(value = "预留手机号", required = true)
//    @NotEmpty(message = "预留手机号未填写")
//    private String mobile;
//
//    @ContextParam("remote_ip")
//    private String ip;
//}
