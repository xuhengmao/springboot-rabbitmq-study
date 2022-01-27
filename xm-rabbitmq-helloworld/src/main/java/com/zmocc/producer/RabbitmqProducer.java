package com.zmocc.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName : RabbitmqProducer
 * @Description : 生产者
 * @Author : xgm
 * @Date: 2022-01-25 16:34
 */
@Component
public class RabbitmqProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * 发送简单消息
     * @param msg 消息
     */
    public void sendSimpleMessage(String msg){
        rabbitTemplate.convertAndSend("hello",msg);
    }

}
