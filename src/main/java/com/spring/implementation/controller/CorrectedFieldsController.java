package com.spring.implementation.controller;

import com.spring.implementation.data.transfer.object.MessageDto;
import com.spring.implementation.data.transfer.object.PersonDetailsDto;
import com.spring.implementation.service.CorrectedFieldsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("correct")
public class CorrectedFieldsController {
    private final Logger log = LoggerFactory.getLogger(PersonDetailsController.class);
    @Autowired
    private CorrectedFieldsService correctedFieldsService;
    @PostMapping("/update/{reqID}")
    public MessageDto updatePersonDetailsById(@RequestBody PersonDetailsDto personDetailsDto , @PathVariable("reqID") int reqID)
    {
        log.info("Update call have been received at correct/update with DTO "+personDetailsDto);
        return correctedFieldsService.updatePersonDetailsById(personDetailsDto , reqID);
    }
}
