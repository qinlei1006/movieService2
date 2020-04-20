package com.lovo.pay.service;


import com.lovo.pay.entity.OrderEntity;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 模拟出票成功
 */
@Component
public class TicketOutService {
    @RabbitListener(queues = "movieQueue")
    public void ticketOk(OrderEntity orderEntity, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag){
        try {
            channel.basicAck(tag,false);
            System.out.println("出票成功:"+orderEntity.getMovieName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
