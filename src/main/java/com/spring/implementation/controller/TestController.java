package com.spring.implementation.controller;

import com.spring.implementation.domain.PersonDetailsDomain;
import com.spring.implementation.domain.TestDomain;
import com.spring.implementation.repository.PersonDetailsRepository;
import com.spring.implementation.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/Test")
public class TestController {
    @Autowired
    private TestRepository testRepository;
    @Autowired
    private PersonDetailsRepository personDetailsRepository;
    @GetMapping("/add")
    public String addCategory()
    {
        TestDomain testDomain = new TestDomain();
        testDomain.setName("Rohail");
        testDomain.setAge("22");
        testRepository.save(testDomain);
        return "Added";
    }
    @GetMapping("/db")
    public String addTestData()
    {
        PersonDetailsDomain personDetailsDomain = new PersonDetailsDomain();
        personDetailsDomain.setName("Test Name");
        personDetailsDomain.setPlace("Test place");
        personDetailsDomain.setIdentity("Test Identity");
        personDetailsDomain.setStatus("Test Status");
        personDetailsDomain.setAccName("Test accName");
        personDetailsDomain.setAccNumber("Test 1234");
        personDetailsDomain.setStream("Test Stream");
        personDetailsRepository.save(personDetailsDomain);
        return "Added";
    }
}
