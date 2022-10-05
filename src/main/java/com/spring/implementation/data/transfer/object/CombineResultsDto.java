package com.spring.implementation.data.transfer.object;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CombineResultsDto {

    private int id;
    private String accName;
    private String accNumber;
    private String name;
    private String place;
    private String identity;
    private String stream;
    private String status;
    private String correctedAccName;
    private String correctedAccNumber;
    private String correctedName;
    private String correctedStream;


}
