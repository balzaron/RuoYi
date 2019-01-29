package com.ruoyi.ach.domain;

import com.ruoyi.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 分期表 installment
 *
 * @author lerry
 * @date 2019-01-28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="分期",parent=BaseEntity.class)
public class Installment extends BaseEntity{

    private static final long serialVersionUID=1L;
    
    @ApiModelProperty(value="分期账单id",name="id")
    private Integer id;
        
    @ApiModelProperty(value="客户名称",name="clientName")
    private String clientName;
        
    @ApiModelProperty(value="客户身份证号",name="clientId")
    private String clientId;
        
    @ApiModelProperty(value="客户车牌号",name="carNumber")
    private String carNumber;
        
    @ApiModelProperty(value="客户发动机号",name="engineNumber")
    private String engineNumber;
        
    @ApiModelProperty(value="初次登记日期",name="registerDate")
    private Date registerDate;
        
    @ApiModelProperty(value="客户手机号码",name="mobile")
    private String mobile;
        
    @ApiModelProperty(value="分期总额",name="installmentTotal")
    private BigDecimal installmentTotal;
        
    @ApiModelProperty(value="分期周期",name="installmentCircle")
    private Integer installmentCircle;
    
}
