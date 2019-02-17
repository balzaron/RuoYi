package com.ruoyi.common.utils.model;

public class PhoneSignUpParam {


	
	public PhoneSignUpParam(String phone) {
		super();
		this.phone = phone;
		this.type = 1;
	}

	public PhoneSignUpParam(String phone, Integer type) {
		super();
		this.phone = phone;
		this.type = type;
	}

	private String phone;
	
	private Integer type;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	
	
}
