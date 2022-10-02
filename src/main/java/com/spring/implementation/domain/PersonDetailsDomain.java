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
public class PersonDetailsDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reqID;
    private String accName;
    private String accNumber;
    private String name;
    private String place;
    private String identity;
    private String stream;
    private String status;
}
