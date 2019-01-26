package com.ruoyi.ach.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private static void doPost(Response response) throws IOException {
//        Headers headers = response.headers();
//        for (int i = 0; i < headers.size(); i++) {
//            logger.info( headers.name(i) + ":" + headers.value(i));
//        }
        logger.info( "onResponse: " + response.body().string());
    }

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


    /**
     * async post a file
     * @param url
     * @param filePath
     */
    public static void post(String url, String filePath) {
        File file = new File(filePath);
        Request request = new  Request.Builder()
                .url(url)
                .post(RequestBody.create(mediaType, file))
                .build();
        client.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                logger.error(e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                logger.info(response.protocol() + " " +response.code() + " " + response.message());
                doPost(response);
            }
        });
    }

    /**
     * async post a pojo
     * @param url
     * @param obj
     */
    public static void post(String url, Object obj) {
        String body = JSONObject.toJSONString(obj);
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(mediaType, body))
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                logger.error("onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                doPost(response);
            }
        });
    }

}
