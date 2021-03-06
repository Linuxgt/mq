package com.linuxgt.demo.mqproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqProducerApplicationTests {

    @Resource
    private Producer producer;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 10; i++) {
            producer.sendMsg("test.queue", "message num:" + i);
        }
    }
}
