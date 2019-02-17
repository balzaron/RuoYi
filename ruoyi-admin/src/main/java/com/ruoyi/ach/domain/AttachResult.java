package com.ruoyi.ach.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AttachResult {

    @ApiModelProperty("附件类型: " +
            "营业执照:business_license\n" +
            "身份证照片1:id_card1\n" +
            "身份证照片2:id_card2\n" +
            "手持身份证照片:id_card_handheld\n" +
            "车辆行驶证:car_driving_license\n" +
            "投保单:insurance\n" +
            "贷款合同：loan_contract\n" +
            "挂靠证明:affiliated_prove\n" +
            "车辆抵押合同:mortgage_contract\n" +
            "租赁服务合同:lease_contract\n" +
            "机动车登记证书:car_property\n" +
            "保单原件:insurance_original\n" +
            "驾驶证:driving_license\n" +
            "保单发票:insurance_invoice\n" +
            "交强险附件:traffic_insurance\n" +
            "车船税证明:vehicle_vessel_tax\n" +
            "交强险保单发票:traffic_insurance_invoice\n" +
            "商业险保单:business_insurance\n" +
            "商业险发票:business_insurance_invoice\n" +
            "其他附件:other\"")
    private String type;

    @ApiModelProperty("附件Code")
    private String file_code;
}