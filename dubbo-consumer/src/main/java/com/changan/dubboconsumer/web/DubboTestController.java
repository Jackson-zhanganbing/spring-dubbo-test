package com.changan.dubboconsumer.web;

import com.changan.dubboconsumer.service.DubboTestService;
import com.changan.service.DubboProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * dubbo3 consumer
 *
 * @author zab
 * @date 2023/7/15 11:20
 */
@RestController
@RequestMapping("/test")
public class DubboTestController {

    @Autowired
    private DubboTestService dubboTestService;

    @RequestMapping("/hello")
    public String sayHelloToDubbo(){
        return dubboTestService.sayHello();
    }
}
