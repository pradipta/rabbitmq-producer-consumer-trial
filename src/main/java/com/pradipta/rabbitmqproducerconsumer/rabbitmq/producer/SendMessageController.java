package com.pradipta.rabbitmqproducerconsumer.rabbitmq.producer;

import com.pradipta.rabbitmqproducerconsumer.rabbitmq.config.ConfigureRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    private final RabbitTemplate rabbitTemplate;

    public SendMessageController(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/message")
    public String sendMessage(@RequestParam String message){
        rabbitTemplate.convertAndSend("pradiptaSpringEx", "pradipta.springmessage", message);
        return "Message: "+message+" sent";
    }
}
