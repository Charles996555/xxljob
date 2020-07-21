package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 张雨潇
 * @Date: 2020/7/13 16:52
 */

@Component
public class DemoJobHandler {

    private static transient Logger logger= LoggerFactory.getLogger(DemoJobHandler.class);

    @Value("${server.port}")
    private String serverPort;

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler(String param) throws Exception {
        XxlJobLogger.log("demojobhandler在执行，我的端口是："+serverPort);

//        for (int i = 0; i < 5; i++) {
//            XxlJobLogger.log("beat at:" + i);
//            TimeUnit.SECONDS.sleep(2);
//        }
        return ReturnT.SUCCESS;
    }
}
