package com.spring.implementation.controller;

import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import com.spring.implementation.domain.PersonDetailsDomain;
import com.spring.implementation.service.PersonDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("details")
public class PersonDetailsController {
    private final Logger log = LoggerFactory.getLogger(PersonDetailsController.class);
    @Autowired
    private PersonDetailsService personDetailsService;
    @GetMapping("/getAll")
    public List<PersonDetailsDomain> getAllDetail()
    {
        log.info("getAll call have been received at details/add");
        return personDetailsService.getAllDetails();
    }
    @PostMapping("/add")
    public MessageDto addPersonDetails(@RequestBody PersonDetailsDto personDetailsDto)
    {
        log.info("Post call have been received at details/add with DTO "+personDetailsDto);
        return personDetailsService.addPersonalDetails(personDetailsDto);
    }
}
