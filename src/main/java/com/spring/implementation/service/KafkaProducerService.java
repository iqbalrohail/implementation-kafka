package com.spring.implementation.service;

import com.spring.implementation.data.transfer.object.KafkaMessageDto;
import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    KafkaTemplate<String , Object> kafkaTemplate;
    public MessageDto produceDataOnKafka(KafkaMessageDto kafkaMessageDto)
    {
        String kafkaMessage =  kafkaMessageDto.getKafkaMessage();
        kafkaTemplate.send("kafkaTopicTest" , kafkaMessage);
        String message = "Message have been sent to kafka";
        MessageDto messageDto = new MessageDto(message);
        return messageDto;
    }
    public MessageDto producePersonDetailsJsonOnKafka(PersonDetailsDto personDetailsDto)
    {
        kafkaTemplate.send("kafkaTopicTest" , personDetailsDto);
        String message = "Message have been sent to kafka";
        MessageDto messageDto = new MessageDto(message);
        return messageDto;
    }
}
