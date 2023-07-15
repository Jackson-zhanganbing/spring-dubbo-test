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
@Activate(group = {CommonConstants.CONSUMER})
public class DubboRpcFilter implements Filter {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcContext context = RpcContext.getServerAttachment();
        UserDTO user = new UserDTO("zhangsan", 9);
        context.setAttachment("user", JSONUtil.toJsonStr(user));

        return invoker.invoke(invocation);
    }
}
