package com.spring.implementation.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import com.spring.implementation.domain.PersonDetailsDomain;
import com.spring.implementation.repository.PersonDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDetailsService {
    @Autowired
    private PersonDetailsRepository personDetailsRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaProducerService kafkaProducerService;
    public List<PersonDetailsDomain> getAllDetails()
    {
        return personDetailsRepository.findAll();
    }
    public MessageDto addPersonalDetails(PersonDetailsDto personDetailsDto)
    {
        PersonDetailsDomain personDetailsDomain = mapDtoToDomain(personDetailsDto);
        personDetailsRepository.save(personDetailsDomain);
        String message = "Details have been saved with id "+personDetailsDomain.getReqID();
        MessageDto messageDto = new MessageDto(message);
        return messageDto;
    }
    public PersonDetailsDomain mapDtoToDomain(PersonDetailsDto personDetailsDto) {
        return objectMapper.convertValue(personDetailsDto, PersonDetailsDomain.class);
    }
    public PersonDetailsDto mapDomainToDto(PersonDetailsDomain personDetailsDomain) {
        return objectMapper.convertValue(personDetailsDomain, PersonDetailsDto.class);
    }
}
