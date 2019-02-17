package com.ruoyi.common.utils.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.ruoyi.common.utils.SignUtils;
import com.ruoyi.common.utils.model.ErrorEntity;
import com.ruoyi.common.utils.model.PhoneSignUpParam;
import com.ruoyi.common.utils.model.ResultEntity;

import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: shanyue.gao
 * @date: 2019/1/22 下午3:17
 */

@Component
public class HttpUtil {

	private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);
	private static final MediaType mediaType = MediaType.parse("text/x-markdown; charset=utf-8");

	private static OkHttpClient client = new OkHttpClient.Builder()
//            .sslSocketFactory(null, null)
			.connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(5, TimeUnit.SECONDS)
			.build();

//    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	private static void doPost(Response response) throws IOException {
//        Headers headers = response.headers();
//        for (int i = 0; i < headers.size(); i++) {
//            logger.info( headers.name(i) + ":" + headers.value(i));
//        }
		logger.info("onResponse: " + response.body().string());
	}

	public static Response get(String url) {
		Response response = null;
		Request request = new Request.Builder().url(url).build();
		try {
			response = client.newCall(request).execute();
		} catch (IOException e) {
			logger.error(e.toString());
		}
		return response;
	}

	/**
	 * async post a file
	 * 
	 * @param url
	 * @param filePath
	 */
	public static void post(String url, String filePath) {
		File file = new File(filePath);
		Request request = new Request.Builder().url(url).post(RequestBody.create(mediaType, file)).build();
		client.newCall(request).enqueue(new Callback() {

			@Override
			public void onFailure(Call call, IOException e) {
				logger.error(e.toString());
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				logger.info(response.protocol() + " " + response.code() + " " + response.message());
				doPost(response);
			}
		});
	}

//    /**
//     * async post a pojo
//     * @param url
//     * @param obj
//     */
//    public void post(String url, Object obj) {
//        String body = JSONObject.toJSONString(obj);
//        Request request = new Request.Builder()
//                .url(url)
//                .post(RequestBody.create(mediaType, body))
//                .build();
//        client.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                logger.error("onFailure: " + e.getMessage());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                doPost(response);
//            }
//        });
//    }

//    @Value("merchantNo")
	private static String merchantNo = "ACH";

	public static String merchantNoTmp;

//    @Value("${smtpHost}")
	public void setSmtpHost(String smtpHost) {
		this.merchantNo = smtpHost;
	}

	public static <T, E> T post(String url, E parameter, Class<T> retClazz) {

		MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
		// 使用JSONObject封装参数
		String par = JSON.toJSONString(parameter);
		System.out.println(par);

		// 创建RequestBody对象，将参数按照指定的MediaType封装
		RequestBody requestBody = RequestBody.create(mediaType, par);

		long ts = System.currentTimeMillis();
		SignUtils sign = new SignUtils(par, merchantNo, ts);
		System.out.println(sign.sign());

		Request request = new Request.Builder().post(requestBody).url(url).header("merchant_no", merchantNo)
				.header("timestamp", String.valueOf(ts)).header("sign", sign.sign()).build();
		System.out.println(request);

		T result = null;

		try {
			Response response = client.newCall(request).execute();
			System.out.println(response);
//			System.out.println(response.body().string());
//			String RespStr = response.body().string();
			InputStream is = response.body().byteStream();
			Type type = new TypeReference<ResultEntity<? extends T>>() {
			}.getType();
			ResultEntity<? extends T> respEntity = JSON.parseObject(is, type);
			System.out.println(respEntity.toString());
			if (respEntity.success()) {
				result = respEntity.getContent();

			} else {
				ErrorEntity errorEntity = respEntity.getError();
				System.out.println(JSON.toJSONString(errorEntity));

				throw new SdxdBizException(Integer.valueOf(respEntity.getCode()),
						String.valueOf(respEntity.getError()));
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static String url = "http://163.53.168.218:8080/api/pub/2.0.0/insurance-installment/register";

	public static void main(String[] args) {

		PhoneSignUpParam phoneSign = new PhoneSignUpParam("13800138001");
		String str = post(url, phoneSign, String.class);
		System.out.println(str);

//		MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
//		// 使用JSONObject封装参数
//		String par = JSON.toJSONString(phoneSign);
//		System.out.println(par);
//
//		// 创建RequestBody对象，将参数按照指定的MediaType封装
//		RequestBody requestBody = RequestBody.create(mediaType, par);
//		System.out.println(requestBody);
//
//		long ts = System.currentTimeMillis();
//		SignUtils sign = new SignUtils(par, merchantNo, ts);
//		System.out.println(sign.sign());
//
//		Request request = new Request.Builder().post(requestBody).url(url).header("merchant_no", merchantNo)
//				.header("timestamp", String.valueOf(ts)).header("sign", sign.sign())
////                 .header("sign", "12345")
//				.build();
//		System.out.println(request);
//		try {
//			Response response = client.newCall(request).execute();
//			System.out.println(response);
//			System.out.println(response.body().string());
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}
}
