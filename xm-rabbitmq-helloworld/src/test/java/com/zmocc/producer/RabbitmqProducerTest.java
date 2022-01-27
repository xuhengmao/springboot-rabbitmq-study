package com.zmocc.producer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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


}