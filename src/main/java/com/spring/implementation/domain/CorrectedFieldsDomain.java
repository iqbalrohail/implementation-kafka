package com.spring.implementation.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CorrectedFieldsDomain {

    @Id
    private int id;
    private String correctedAccName;
    private String correctedAccNumber;
    private String correctedName;
    private String correctedStream;
}
