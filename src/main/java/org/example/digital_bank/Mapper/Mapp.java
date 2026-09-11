package org.example.digital_bank.Mapper;

import org.example.digital_bank.Dto.AccountDto;
import org.example.digital_bank.Dto.CustomerDto;
import org.example.digital_bank.entity.Account;
import org.example.digital_bank.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class Mapp {
//public CustomerDto toDto(Customer customer){
//    return new CustomerDto(customer.getId(),customer.getName(),customer.getAccNo(),customer.getAccName(),
//            customer.getTypeOfAcc());
//}
//    public Customer toCust(CustomerDto customer){
//        return new Customer(customer.getId(),customer.getName(),customer.getAccNo(),customer.getAccName(),
//                customer.getTypeOfAcc());
//    }
    public CustomerDto toDto(Customer customer) {
        if (customer == null) return null;
        CustomerDto dto = new CustomerDto();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setAccno(customer.getAccno());
        dto.setAccname(customer.getAccname());
        dto.setTypeofacc(customer.getTypeofacc());
        return dto;
    }

    public Customer toCust(CustomerDto customerDto) {
        if (customerDto == null) return null;
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setAccno(customerDto.getAccno());
        customer.setAccname(customerDto.getAccname());
        customer.setTypeofacc(customerDto.getTypeofacc());
        return customer;
    }

    public AccountDto toAccDto(Account accountDto){
        return new AccountDto(accountDto.getId(),accountDto.getAccno(),accountDto.getAccname(),
                accountDto.getTypeofacc());
    }
    public Account toAcc(AccountDto accountDto){
        return new Account(accountDto.getId(),accountDto.getAccno(),accountDto.getAccname(),
                accountDto.getTypeofacc());
    }


}
