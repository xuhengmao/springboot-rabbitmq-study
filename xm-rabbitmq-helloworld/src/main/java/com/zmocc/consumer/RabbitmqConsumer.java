package com.zmocc.consumer;

import com.rabbitmq.client.Channel;
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

    /**
     * 消费者1接收消息
     * @param message 消息
     */
    @RabbitListener(queues = "hello")
    public void simpleMessage(String message, Channel channel){
        log.info("receive 接收到的消息-{}",message);
    }

    /**
     * 消费者2接收消息，并concurrency 为 2，此时，对于第二个消费者，将会同时存在 2 个子线程去消费消息
     * @param message 消息
     */
    @RabbitListener(queues = "hello",concurrency = "2")
    public void simpleMessage2(String message){
        log.info("receive2 接收到的消息-{}",message);
    }

}
