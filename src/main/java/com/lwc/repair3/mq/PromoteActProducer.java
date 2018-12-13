package com.lwc.repair3.mq;

import com.lwc.repair3.bean.RSAData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * describe:
 *
 * @author laizhihui
 * @date 2018/02/28
 */
@Component
@EnableScheduling
public class PromoteActProducer {

    @Autowired// 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage(Destination destination, final RSAData rsaData) {
        this.jmsMessagingTemplate.convertAndSend(destination, rsaData);
    }
}

