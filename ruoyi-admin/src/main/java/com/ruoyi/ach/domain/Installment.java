package com.ruoyi.ach.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 分期表 installment
 * 
 * @author shanyue.gao
 * @date 2019-02-10
 */
public class Installment extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 分期账单id */
	private Integer id;
	/** 客户名称 */
	private String clientName;
	/** 客户身份证号 */
	private String clientId;
	/** 客户车牌号 */
	private String carNumber;
	/** 客户发动机号 */
	private String engineNumber;
	/** 初次登记日期 */
	private Date registerDate;
	/** 客户手机号码 */
	private String mobile;
	/** 分期总额 */
	private BigDecimal installmentTotal;
	/** 分期周期 */
	private Integer installmentCircle;
	/** 分销商id */
	private Integer agentId;
	/** 审批状态 */
	private Integer approvalStatus;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setClientName(String clientName) 
	{
		this.clientName = clientName;
	}

	public String getClientName() 
	{
		return clientName;
	}
	public void setClientId(String clientId) 
	{
		this.clientId = clientId;
	}

	public String getClientId() 
	{
		return clientId;
	}
	public void setCarNumber(String carNumber) 
	{
		this.carNumber = carNumber;
	}

	public String getCarNumber() 
	{
		return carNumber;
	}
	public void setEngineNumber(String engineNumber) 
	{
		this.engineNumber = engineNumber;
	}

	public String getEngineNumber() 
	{
		return engineNumber;
	}
	public void setRegisterDate(Date registerDate) 
	{
		this.registerDate = registerDate;
	}

	public Date getRegisterDate() 
	{
		return registerDate;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

	public String getMobile() 
	{
		return mobile;
	}
	public void setInstallmentTotal(BigDecimal installmentTotal) 
	{
		this.installmentTotal = installmentTotal;
	}

	public BigDecimal getInstallmentTotal() 
	{
		return installmentTotal;
	}
	public void setInstallmentCircle(Integer installmentCircle) 
	{
		this.installmentCircle = installmentCircle;
	}

	public Integer getInstallmentCircle() 
	{
		return installmentCircle;
	}
	public void setAgentId(Integer agentId) 
	{
		this.agentId = agentId;
	}

	public Integer getAgentId() 
	{
		return agentId;
	}
	public void setApprovalStatus(Integer approvalStatus) 
	{
		this.approvalStatus = approvalStatus;
	}

	public Integer getApprovalStatus() 
	{
		return approvalStatus;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("clientName", getClientName())
            .append("clientId", getClientId())
            .append("carNumber", getCarNumber())
            .append("engineNumber", getEngineNumber())
            .append("registerDate", getRegisterDate())
            .append("mobile", getMobile())
            .append("installmentTotal", getInstallmentTotal())
            .append("installmentCircle", getInstallmentCircle())
            .append("agentId", getAgentId())
            .append("approvalStatus", getApprovalStatus())
            .toString();
    }
}
