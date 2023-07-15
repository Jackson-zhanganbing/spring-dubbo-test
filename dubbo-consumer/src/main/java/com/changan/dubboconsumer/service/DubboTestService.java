package com.changan.dubboconsumer.service;

import com.changan.service.DubboProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class DubboTestService {

    @DubboReference
    private DubboProviderService dubboProviderService;

    public String sayHello() {
        return dubboProviderService.sayHello();
    }
}
