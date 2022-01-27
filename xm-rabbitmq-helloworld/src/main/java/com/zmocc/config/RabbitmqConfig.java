package com.zmocc.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : RabbitmqConfig
 * @Description : 配置类
 * @Author : xgm
 * @Date: 2022-01-25 16:25
 */
@Configuration
public class RabbitmqConfig {

    private final String QUEUE_NAME="hello";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE_NAME);
    }

}
