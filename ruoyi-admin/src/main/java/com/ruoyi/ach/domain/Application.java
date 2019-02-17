package com.ruoyi.ach.domain;

import com.sun.xml.internal.ws.api.message.Attachment;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Application {

    @ApiModelProperty("用户标示")
    @NotBlank(message = "用户标示未填写")
    private String user_id;

    @ApiModelProperty("订单号")
    @NotBlank(message = "订单号未填写")
    private String order_id;
    @ApiModelProperty("意向金:  0 - 不支付意向金, 1 - 需要支付意向金")
    @NotNull(message = "意向金未填写")
    private Integer front_money;
    @ApiModelProperty("交强险金额")
    @NotNull(message = "交强险金额")
    private BigDecimal forced_amount;
    @ApiModelProperty("车船税")
    @NotNull(message = "车船税")
    private BigDecimal vehicle_vessel_tax;
    @ApiModelProperty("商户保留信息")
    private String reserve;
    @ApiModelProperty("回调接口地址")
    @NotBlank(message = "回调接口地址未填写")
    private String notify_url;
    @ApiModelProperty("车架号")
    @NotBlank(message = "车架号未填写")
    private String vin;
    @ApiModelProperty("发动机号")
//    @NotBlank(message = "发动机号未填写")
    private String engine_num;
    @ApiModelProperty("车牌号")
    private String license_plate_number;
    @ApiModelProperty("车主名称")
    @NotBlank(message = "车主名称未填写")
    private String owner;
    @ApiModelProperty("借款订单金额, 单位: 元")
    @NotBlank(message = "借款订单金额未填写")
    @Pattern(regexp = "^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$",message = "请填写正确的金额")
    private String amount;
    @ApiModelProperty("期数")
    @NotBlank(message = "期数未填写")
    @Pattern(regexp = "^[0-9]*[1-9][0-9]*$",message = "请填写正确的期数")
    private String periods;
    @ApiModelProperty(value = "还款方式: 1 - 一次性付清利息, 2 - 按月支付利息",allowableValues = "1,2")
    @NotNull(message = "还款方式未填写")
    private Integer repay_type;
    @ApiModelProperty("用户申请日期")
    @NotNull(message = "用户申请日期未填写")
    private Date apply_date;
    @ApiModelProperty("被保险人")
    @NotBlank(message = "被保险人未填写")
    private String insurer;
    @ApiModelProperty("投保单号")
    @NotBlank(message = "投保单号未填写")
    private String insurance_number;
    @ApiModelProperty("保费, 单位: 元")
    @NotBlank(message = "保费未填写")
    @Pattern(regexp = "^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$",message = "请填写正确的金额")
    private String insurance_amount;
    @ApiModelProperty("保险生效日")
    private Date insurance_effective_date;
    @ApiModelProperty("保险终止日")
    private Date insurance_termination_date;

    @ApiModelProperty("保险公司账户名称")
    @NotBlank(message = "保险公司账户名称未填写")
    private String insurer_account_name;
    @ApiModelProperty("保险公司账户")
    @NotBlank(message = "保险公司账户未填写")
    private String insurer_account;

    @ApiModelProperty("保险公司开户行省份")
    @NotBlank(message = "保险公司开户行省份未填写")
    private String bank_province;
    @ApiModelProperty("保险公司开户行城市")
    @NotBlank(message = "保险公司开户行城市未填写")
    private String bank_city;
    @ApiModelProperty("保险公司开户行区/县")
    @NotBlank(message = "保险公司开户行区/县未填写")
    private String bank_area;

    @ApiModelProperty("保险公司开户行")
    @NotBlank(message = "保险公司开户行未填写")
    private String insurer_opening_bank;
    //保险公司开户行简称
    @ApiModelProperty("保险公司开户行简称")
    @NotBlank(message = "保险公司开户行简称未填写")
    private String insurer_opening_bank_short_name;
    @ApiModelProperty("合同签署日期")
    @NotNull(message = "合同签署日期未填写")
    private Date contract_sign_time;

    @ApiModelProperty(value = "借款人类型: 1 - 个人, 2 - 企业",allowableValues = "1,2")
    @NotNull(message = "借款人类型未填写")
    private Integer type;

    @ApiModelProperty("企业负责人")
    private String charge_name;
    @ApiModelProperty("负责人身份证")
    private String charge_id_card;
    @ApiModelProperty("公司名称")
    private String company;
    @ApiModelProperty("公司地址")
    private String company_address;
    @ApiModelProperty("企业代码")
    private String company_code;


    @ApiModelProperty("借款申请人/企业")
    @NotBlank(message = "申请人/企业 名称不能为空")
    private String apply_name;
    @ApiModelProperty("借款人身份证号")
    private String applier_id_card;
    @ApiModelProperty("联系地址")
    private String applier_address;

    @ApiModelProperty("附件列表")
    @NotNull(message = "附件列表未填写")
    private List<AttachmentV2> attachments;

//    @FieldIgnore
    private String merchantNo;






}