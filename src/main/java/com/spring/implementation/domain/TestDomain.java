package com.spring.implementation.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TestDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name ;
    String age ;

}
