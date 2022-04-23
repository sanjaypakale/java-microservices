package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kaka")
public class UserResource {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public static String TOPIC = "KAFKA_EX";

    @PostMapping("/publish/{message}")
    public String post(@PathVariable("message") String message) {
        kafkaTemplate.send(TOPIC, message);

        return "message published";
    }
}
