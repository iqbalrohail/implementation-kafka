package com.spring.implementation.data.transfer.object;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CorrectedFieldsDto {
    private int id;
    private String correctedAccName;
    private String correctedAccNumber;
    private String correctedName;
    private String correctedStream;
}
