package com.spring.implementation.controller;

import com.spring.implementation.data.transfer.object.CombineResultsDto;
import com.spring.implementation.service.CombineResultsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("results")
public class CombineResultsController {

    private final Logger log = LoggerFactory.getLogger(CombineResultsController.class);
    @Autowired
    private CombineResultsService combineResultsService;

    @GetMapping("/view/{id}")
    public CombineResultsDto getAllResults(@PathVariable("id") int id)
    {
        log.info("Get call have been received at /view/{id} with id "+id);
        return combineResultsService.getAllResults(id);
    }
}
