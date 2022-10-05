package com.spring.implementation.service;

import com.spring.implementation.data.transfer.object.CombineResultsDto;
import com.spring.implementation.domain.CorrectedFieldsDomain;
import com.spring.implementation.domain.PersonDetailsDomain;
import com.spring.implementation.repository.CorrectedFieldsRepository;
import com.spring.implementation.repository.PersonDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CombineResultsService {

    @Autowired
    private PersonDetailsRepository personDetailsRepository;

    @Autowired
    private CorrectedFieldsRepository correctedFieldsRepository;

    public CombineResultsDto getAllResults(int id)
    {
        PersonDetailsDomain personDetailsDomain = personDetailsRepository.findById(id).get();
        CorrectedFieldsDomain correctedFieldsDomain = correctedFieldsRepository.findById(id).get();

        CombineResultsDto combineResultsDto = new CombineResultsDto();
        combineResultsDto.setId(personDetailsDomain.getReqID());
        combineResultsDto.setName(personDetailsDomain.getName());
        combineResultsDto.setAccName(personDetailsDomain.getAccName());
        combineResultsDto.setAccNumber(personDetailsDomain.getAccNumber());
        combineResultsDto.setIdentity(personDetailsDomain.getIdentity());
        combineResultsDto.setPlace(personDetailsDomain.getPlace());
        combineResultsDto.setStatus(personDetailsDomain.getStatus());
        combineResultsDto.setStream(personDetailsDomain.getStream());

        combineResultsDto.setCorrectedName(correctedFieldsDomain.getCorrectedName());
        combineResultsDto.setCorrectedAccName(correctedFieldsDomain.getCorrectedAccName());
        combineResultsDto.setCorrectedStream(correctedFieldsDomain.getCorrectedStream());
        combineResultsDto.setCorrectedAccNumber(correctedFieldsDomain.getCorrectedAccNumber());

        return combineResultsDto;

    }
}
