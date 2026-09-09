package org.example.digital_bank.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@AllArgsConstructor@NoArgsConstructor
public class AccountDto {

    private Long id;

    private Long AccNo;
    private String AccName;
    private String TypeOfAcc;
}
