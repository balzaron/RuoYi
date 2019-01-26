package com.ruoyi.ach.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author: shanyue.gao
 * @date: 2019/1/22 下午3:17
 */
@Component
public class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    private static OkHttpClient client = new OkHttpClient.Builder()
//            .sslSocketFactory(null, null)
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .build();

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static Response get(String url){
        Response response = null;
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            response = client.newCall(request).execute();
        }catch (IOException e){
            logger.error(e.toString());
        }
        return response;
    }

    public Response post(String url, Object obj) {
        Response response = null;
        RequestBody body = RequestBody.create(JSON, JSONObject.toJSONString(obj));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try{
            response = client.newCall(request)
                    .execute();

        } catch (IOException e){
            logger.error(e.toString());
        }
        return response;
    }
}
