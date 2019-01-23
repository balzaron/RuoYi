package com.ruoyi.ach.http;

import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author: shanyue.gao
 * @date: 2019/1/22 下午3:17
 */
@Component
public class HttpUtil {
    private OkHttpClient client = new OkHttpClient.Builder()
            .sslSocketFactory(null, null)
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .build();
    public Response get(String url){
        Response response = null;
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            response = client.newCall(request).execute();
        }catch (IOException e){
            e.printStackTrace();
        }
        return response;
    }

    public Response post(String url, JSON body) {
        return null;
    }
}
