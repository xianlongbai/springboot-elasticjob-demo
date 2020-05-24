package com.bxl.springbootelasticjobdemo.service;

import com.bxl.springbootelasticjobdemo.config.Config;
import com.bxl.springbootelasticjobdemo.utils.SpringContextUtil;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyElasticJob implements SimpleJob {

    private static final Logger logger = LoggerFactory.getLogger(MyElasticJob.class);

    @Override
    public void execute(ShardingContext context) {
//        logger.info("任务名称：{}，TaskID:{}，ShardingItem:{},JobParameter:{},ShardingParameter:{},ShardingTotalCount:{}",context.getJobName(),context.getTaskId(),context.getShardingItem(),
//                context.getJobParameter(),context.getShardingParameter(),context.getShardingTotalCount());
        Config config = (Config)SpringContextUtil.getBean("config");
        switch (context.getShardingItem()) {
            case 0:
                logger.info("通过环境：{}，执行分片：{}，分片映射：{}", config.getEnv(), context.getShardingParameter(), 0);
                break;
            case 1:
                logger.info("通过环境：{}，执行分片：{}，分片映射：{}", config.getEnv(), context.getShardingParameter(), 1);
                break;
            case 2:
                logger.info("通过环境：{}，执行分片：{}，分片映射：{}", config.getEnv(), context.getShardingParameter(), 2);
                break;
        }
    }


}
