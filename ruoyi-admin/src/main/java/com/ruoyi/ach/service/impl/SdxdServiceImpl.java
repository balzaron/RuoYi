package com.ruoyi.ach.service.impl;

import com.ruoyi.ach.domain.Application;
import com.ruoyi.ach.domain.ApplyResult;
import com.ruoyi.ach.domain.RegisterRequest;
import com.ruoyi.ach.domain.RegisterResponse;
import com.ruoyi.ach.service.IsdxdService;
import com.ruoyi.common.json.JSON;
import com.ruoyi.common.utils.http.HttpUtil;
import com.ruoyi.common.utils.http.HttpUtils;
import org.springframework.beans.factory.annotation.Value;

public class SdxdServiceImpl implements IsdxdService {

    private static final String prefix = "$sdxd.urls.";

    @Value(prefix+"register")
    private String registerUrl;

    @Value(prefix+"apply")
    private String applyUrl;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        RegisterResponse response = null;
        try {
            response = HttpUtil.post(registerUrl, request, RegisterResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public ApplyResult apply(Application request) {
        ApplyResult response = null;

        try {
            response = HttpUtil.post(applyUrl,request, ApplyResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }


}
