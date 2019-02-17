package com.ruoyi.ach.service;

import com.ruoyi.ach.domain.Application;
import com.ruoyi.ach.domain.ApplyResult;
import com.ruoyi.ach.domain.RegisterRequest;
import com.ruoyi.ach.domain.RegisterResponse;
import org.springframework.beans.factory.annotation.Value;

public interface IsdxdService {
    public RegisterResponse register(RegisterRequest request);

    public ApplyResult apply(Application application);


}
