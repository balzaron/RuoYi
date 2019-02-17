//package com.ruoyi.ach.domain;
//
//import com.sdxd.common.utils.BillNoUtils;
//import com.sdxd.common.web.vo.RestRequest;
//import com.sdxd.repayment.dubbo.request.ConfirmPreRequest;
//import com.sdxd.repayment.dubbo.request.ConfirmRepayRequest;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.util.List;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotEmpty;
//
//@ApiModel("还款确认提交")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class ConfirmRepay extends RestRequest {
//
//    @ApiModelProperty(value = "用户id",required = true)
//    @NotBlank(message = "用户id未填写")
//    private String user_id;
//
//    @ApiModelProperty(value = "订单ID",required = true)
//    @NotEmpty(message = "订单ID未填写")
//    private String order_id;
//
//    @ApiModelProperty("凭证图片地址")
//    private String voucher_url;
//    @ApiModelProperty("凭证号")
//    private String voucher_no;
//
//    @ApiModelProperty(value = "还款期数（意向金还款无需填写）",required = true)
//    private List<Integer> periods;
//
//    public String getVoucherUrl(){
//        return this.getVoucher_url();
//    }
//    public String getVoucherNo(){
//        return this.getVoucher_no();
//    }
//    public String getUserId(){
//        return this.getUser_id();
//    }
//    public String getOrderId(){
//        return this.getOrder_id();
//    }
//
//
//    public ConfirmRepayRequest buildRequest(){
//        ConfirmRepayRequest request = new ConfirmRepayRequest();
//        request.setRequestId(BillNoUtils.GenerateBillNo());
//        request.setSrc(this.getVoucherUrl());
//        request.setVoucherNo(this.getVoucherNo());
//        request.setStages(this.getPeriods());
//        return request;
//    }
//}
