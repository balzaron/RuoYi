package com.ruoyi.common.utils.model;

import lombok.Data;

@Data
public class ErrorEntity {
	
	private String message;
	
	
	private Error[] errors;
	
	@Data
	public static class Error {
		private String parameter;
		private String message;
	}
}
