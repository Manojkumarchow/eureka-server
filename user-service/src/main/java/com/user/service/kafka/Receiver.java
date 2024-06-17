package com.user.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @Autowired
    private KafkaConfig kafkaConfig;

    @KafkaListener(topics = "my_topic", groupId = "group_id")
    public void receiveMessage(String message) {
        System.out.println("MY DEFAULT KAFKA TOPIC NAME: " + kafkaConfig.getDefaultTopicName());
        System.out.println("Received message: " + message + " from : " + kafkaConfig.getDefaultTopicName());
    }
}
