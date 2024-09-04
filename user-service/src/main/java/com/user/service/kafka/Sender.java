package com.user.service.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.service.web.rest.controller.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
public class Sender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private ObjectMapper mapper = new ObjectMapper();

    public String sendMessage(Map<String, Object> metaData) {
        try {
            if (Objects.nonNull(metaData)) {
                kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC_NAME, String.valueOf(metaData));
//                User user = mapper.readValue(metaData.toString(), User.class);
                return "Message published to Kafka Topic";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed to publish message to Kafka topic";
    }
}
