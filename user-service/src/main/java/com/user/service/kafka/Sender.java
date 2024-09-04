package com.user.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
public class Sender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(Map<String, Object> metaData) {
        try {
            if (Objects.nonNull(metaData)) {
                String message = (String) metaData.get("message");
                System.out.println("Sending message: " + message);
                kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC_NAME, String.valueOf(metaData));
                return "Message published to Kafka Topic";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed to publish message to Kafka topic";
    }
}
