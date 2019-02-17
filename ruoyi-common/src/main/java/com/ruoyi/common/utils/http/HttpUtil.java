package com.ruoyi.common.utils.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.ruoyi.common.utils.SignUtils;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

import java.io.File;
import java.io.IOException;
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
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .build();

    @Value("sdxd.merchantNo")
    private String merchantNo;

    public <T, E> T post (String url, E parameter, Class<T> retClazz){
        MediaType mediaType = MediaType.parse("application/json");
        //使用JSONObject封装参数
        String par = JSON.toJSONString(parameter);
        T result = null;

        //创建RequestBody对象，将参数按照指定的MediaType封装
        RequestBody requestBody = RequestBody.create(mediaType, par);
        Request request = new Request.Builder()
                .post(requestBody).url(url)
                .header("sign", new SignUtils(requestBody.toString(), merchantNo, System.currentTimeMillis()).sign())
                .build();
        try {
            Response response = client.newCall(request).execute();
            assert response.body() != null;
            result =  JSON.parseObject(response.body().string(), retClazz);
            response.body().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
        return result;
    }
}
