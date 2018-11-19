package com.linuxgt.demo.mqconsumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by liuteng on 2018/11/19
 */
@Service
public class Consumer {

    @JmsListener(destination = "test.queue")
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
