package com.lovo.pay.service;


import com.lovo.pay.entity.OrderEntity;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GetPayMQService {
    @Autowired
    private IPayService payService;

   @RabbitListener(queues = "payQueue")
    public void getPay(OrderEntity orderEntity, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag){
      //保存到数据，修改为支付成功

        //手动确认
        try {
            orderEntity.setTag(1);
            payService.savaOrder(orderEntity);
            channel.basicAck(tag,false);

        } catch (IOException e) {
            try {
                channel.basicNack(tag,false,true);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
