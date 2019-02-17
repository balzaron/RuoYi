package com.ruoyi.common.utils.model;

import lombok.Data;

@Data
public class ResultEntity<T> {
	
	private String code;
	
	private ErrorEntity error;
	
	private T content;
	
	public boolean success() {
		return "0".equals(code);
	}
}
