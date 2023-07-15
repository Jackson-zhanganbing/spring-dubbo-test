package com.changan.dubboprovider.service.impl;

import com.changan.service.DubboProviderService;
import org.apache.dubbo.config.annotation.DubboService;
/**
 * dubbo3 provider
 *
 * @author zab
 * @date 2023/7/15 11:20
 */
@DubboService
public class DubboProviderServiceImpl implements DubboProviderService {
    @Override
    public String sayHello() {
        return "hello dubbo!!!!";
    }
}
