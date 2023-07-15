package com.changan.dubboconsumer.filter;

import cn.hutool.json.JSONUtil;
import com.changan.service.dto.UserDTO;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 给dubbo服务加点session或者tranceId
 *
 * @author zab
 * @date 2023/7/15 12:46
 */

@Activate(group = {CommonConstants.CONSUMER, CommonConstants.PROVIDER})
public class DubboRpcFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(DubboRpcFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        // 从上下文中获取Trace ID和用户信息
        UserDTO userDto = new UserDTO("zhangsan",11);
        RpcContext.getContext().setAttachment("user", JSONUtil.toJsonStr(userDto));
        return invoker.invoke(invocation);
    }
}
