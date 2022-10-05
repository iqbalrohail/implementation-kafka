package com.spring.implementation.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class kafkaListener {

    @Autowired
    private PersonDetailsService personDetailsService;

    private final Logger log = LoggerFactory.getLogger(KafkaListener.class);

    @KafkaListener(topics = "kafkaTopicTest" , containerFactory = "kafkaListenerContainerFactory")
    public void listener(Object object)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        PersonDetailsDto personDetailsDto = objectMapper.convertValue(object , PersonDetailsDto.class);
        log.info("listener received "+ personDetailsDto.toString());
        personDetailsService.addPersonalDetails(personDetailsDto);
    }
}
