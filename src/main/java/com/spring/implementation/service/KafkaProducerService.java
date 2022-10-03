package com.spring.implementation.service;

import com.spring.implementation.data.transfer.object.KafkaMessageDto;
import com.spring.implementation.data.transfer.object.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    KafkaTemplate<String , String> kafkaTemplate;
    public MessageDto produceDataOnKafka(KafkaMessageDto kafkaMessageDto)
    {
        String kafkaMessage =  kafkaMessageDto.getKafkaMessage();
        kafkaTemplate.send("kafkaTopicTest" , kafkaMessage);
        String message = "Message have been sent to kafka";
        MessageDto messageDto = new MessageDto(message);
        return messageDto;
    }
}
