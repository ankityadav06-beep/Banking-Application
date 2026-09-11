package org.example.digital_bank.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id ;

    private String name ;

    private Long accno;
    private String accname;
    private String typeofacc;

}
