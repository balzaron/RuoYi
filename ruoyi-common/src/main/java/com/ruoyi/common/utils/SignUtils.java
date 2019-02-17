package com.ruoyi.common.utils;

import com.ruoyi.common.utils.http.HttpUtils;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.boot.web.server.Http2;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignUtils {
	private String body;
	private String merchantNo;
	private Long timeStamp;

	public SignUtils(String body, String merchantNo, Long timeStamp) {
		this.body = body;
		this.merchantNo = merchantNo;
		this.timeStamp = timeStamp;
	}

	public String sign() {
		String ts = this.timeStamp.toString();
//		String s = this.body + "&" + this.merchantNo + "&" + ts;
		String s = plainText();
		String res = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(s.getBytes());
			// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			res = new BigInteger(1, md.digest()).toString(16);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return res;
	}

	private String plainText() {
		String s = String.format("body=%s&merchant_no=%s&timestamp=%s", body, merchantNo, timeStamp);
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		SignUtils su = new SignUtils("{\"body\":12512}","869526029559014", 1487240365519L);
		System.out.println(su.plainText());
		System.out.println(su.sign());
		
		
		String plainTxt = "body={\"user\":12512}&merchant_no=869526029559014&timestamp=1487240365519";
		String md5 = DigestUtils.md5Hex(plainTxt);
		System.out.println(md5);
	}
}
