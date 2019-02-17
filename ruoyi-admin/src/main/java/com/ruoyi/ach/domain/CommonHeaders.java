//package com.ruoyi.ach.domain;
//
//import com.sdxd.common.web.rest.MultiNameHeaderParam;
//import com.sdxd.common.web.vo.RestRequest;
//import io.swagger.annotations.ApiParam;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.ToString;
//
//@Data
//@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
//public class CommonHeaders extends RestRequest {
//
//    @ApiParam(value = "商户号", required = true)
//    @MultiNameHeaderParam(value = "x-merchant-no", alias = {"merchant_no"})
//    private String merchantNo;
//
//    @ApiParam(value = "时间戳", required = true)
//    @MultiNameHeaderParam(value = "x-timestamp", alias = {"timestamp"})
//    private String timestamp;
//
//    @ApiParam(value = "签名", required = true)
//    @MultiNameHeaderParam(value = "x-sign", alias = {"sign"})
//    private String sign;
//}
