package com.spring.implementation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ImplementationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ImplementationApplication.class, args);}

	CommandLineRunner commandLineRunner(KafkaTemplate<String , String > kafkaTemplate)
	{
		return args -> {
		kafkaTemplate.send("kafkaTopicTest" , "Hello this is kafka!");
		};
	}
}
