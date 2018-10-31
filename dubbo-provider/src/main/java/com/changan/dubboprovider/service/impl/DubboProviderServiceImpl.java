package com.changan.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.changan.api.DubboProviderService;
/**
*@author zhanganbing
*@date 2018/10/31/031 22:17
*/
@Service
public class DubboProviderServiceImpl implements DubboProviderService {
    @Override
    public String sayHello() {
        return "hello dubbo!!!!";
    }
}
