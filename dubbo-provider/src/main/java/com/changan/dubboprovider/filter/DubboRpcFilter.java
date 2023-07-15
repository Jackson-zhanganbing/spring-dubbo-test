
package com.changan.dubboprovider.filter;

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

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String user = RpcContext.getContext().getAttachment("user");
        log.info("user:====>{}", user);
        return invoker.invoke(invocation);
    }

}

