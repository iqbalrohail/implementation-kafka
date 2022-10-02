package com.spring.implementation.service;

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

    public List<PersonDetailsDomain> getAllDetails()
    {
        return personDetailsRepository.findAll();
    }



}
