package com.user.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(String message) {
        try {
            System.out.println("Sending message: " + message);
            kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC_NAME, message);
            return "Message published to Kafka Topic";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed to publish message to Kafka topic";
    }
}
