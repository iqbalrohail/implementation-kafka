package com.spring.implementation.controller;

import com.spring.implementation.data.transfer.object.KafkaMessageDto;
import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import com.spring.implementation.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {
    private final Logger log = LoggerFactory.getLogger(PersonDetailsController.class);
    @Autowired
    private KafkaProducerService kafkaProducerService;
    @PostMapping("/produce")
    public MessageDto addPersonDetailsOnKafka(@RequestBody PersonDetailsDto personDetailsDto)
    {
        log.info("Post call have been received at details/add with DTO "+personDetailsDto);
        return kafkaProducerService.producePersonDetailsJsonOnKafka(personDetailsDto);
    }
}
