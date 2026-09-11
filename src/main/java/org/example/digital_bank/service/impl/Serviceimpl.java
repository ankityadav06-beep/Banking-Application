package org.example.digital_bank.service.impl;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.digital_bank.Dto.CustomerDto;
import org.example.digital_bank.Mapper.Mapp;
import org.example.digital_bank.entity.Customer;
import org.example.digital_bank.repository.CustRepo;
import org.example.digital_bank.service.BankServices;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class Serviceimpl implements BankServices {

private CustRepo custRepo;
private Mapp mapp;


    @Override
    public CustomerDto addCust(CustomerDto customerDto) {
       Customer cust1= custRepo.save(mapp.toCust(customerDto));
        return mapp.toDto(cust1);
    }

}
