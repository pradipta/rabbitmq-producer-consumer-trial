package com.pradipta.rabbitmqproducerconsumer.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiveMessageHandler {
    public void handleMessage(String messageBody){
        log.info("Handling message:");
        log.info(messageBody);
    }
}
