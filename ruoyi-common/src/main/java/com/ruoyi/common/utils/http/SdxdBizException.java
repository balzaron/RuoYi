package com.ruoyi.common.utils.http;

public class SdxdBizException extends RuntimeException {
	
	private Integer code;
	private String msg;
	
	
	
	public SdxdBizException(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	
	
	
	
	
}
