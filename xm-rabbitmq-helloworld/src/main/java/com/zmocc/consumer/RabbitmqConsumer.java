package com.zmocc.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName : RabbitmqConsumer
 * @Description : 消费消息
 * @Author : xgm
 * @Date: 2022-01-25 16:39
 */
@Component
@Slf4j
public class RabbitmqConsumer {

    @RabbitListener(queues = "hello")
    public void simpleMessage(String message){
        log.info("接收到的消息-{}",message);
    }

}
