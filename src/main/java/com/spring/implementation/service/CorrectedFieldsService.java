package com.spring.implementation.service;

import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import com.spring.implementation.domain.CorrectedFieldsDomain;
import com.spring.implementation.domain.PersonDetailsDomain;
import com.spring.implementation.repository.CorrectedFieldsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrectedFieldsService {

    @Autowired
    private CorrectedFieldsRepository correctedFieldsRepository;

    public MessageDto updatePersonDetailsById(PersonDetailsDto personDetailsDto, int id)
    {
        if(correctedFieldsRepository.findById(id).isPresent()){
        CorrectedFieldsDomain correctedFieldsDomain = new CorrectedFieldsDomain();
        correctedFieldsDomain.setId(id);
        correctedFieldsDomain.setCorrectedName(personDetailsDto.getName());
        correctedFieldsDomain.setCorrectedAccName(personDetailsDto.getAccName());
        correctedFieldsDomain.setCorrectedAccNumber(personDetailsDto.getAccNumber());
        correctedFieldsDomain.setCorrectedStream(personDetailsDto.getStream());
        correctedFieldsRepository.save(correctedFieldsDomain);

        String responseMessage = "Details has been corrected with ID " + correctedFieldsDomain.getId();
        MessageDto messageDto = new MessageDto();
        messageDto.setResponseMessage(responseMessage);
        return messageDto;}
        else
        {
            String message = "Cannot find object with this id: "+id ;
            MessageDto messageDto = new MessageDto(message);
            return messageDto;
        }
    }
}
