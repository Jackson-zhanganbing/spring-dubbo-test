package com.changan.dubboconsumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.changan.api.DubboProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@author zhanganbing
*@date 2018/10/31/031 22:12
*/
@RestController
@RequestMapping("/test")
public class DubboTestController {

    @Reference
    private DubboProviderService dubboProviderService;

    @RequestMapping("/hello")
    public String sayHelloToDubbo(){
        return dubboProviderService.sayHello();
    }
}
