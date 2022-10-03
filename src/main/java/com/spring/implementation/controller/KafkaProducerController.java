package com.spring.implementation.controller;

import com.spring.implementation.data.transfer.object.KafkaMessageDto;
import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/add")
    public MessageDto produceDataOnKafka(@RequestBody KafkaMessageDto kafkaMessageDto)
    {
        return kafkaProducerService.produceDataOnKafka(kafkaMessageDto);
    }
}
