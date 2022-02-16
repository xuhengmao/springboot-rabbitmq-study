package com.zmocc.producer;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("MQ简单消息发送测试")
class RabbitmqProducerTest {

    @Autowired
    private RabbitmqProducer rabbitmqProducer;

    @Test
    @DisplayName("发送简单消息")
    public void sendHello(){
        rabbitmqProducer.sendSimpleMessage("你好啊");

    }


    @SneakyThrows
    @Test
    @DisplayName("发送多条简单消息-测试消费者消费")
    public void sendHellos(){
        for (int i = 0; i < 10; i++) {
            System.out.println("发送第"+i+"条消息");
            rabbitmqProducer.sendSimpleMessage("你好啊"+i);
        }
    }

}