package org.example.digital_bank.controller;

import lombok.AllArgsConstructor;
import org.example.digital_bank.Dto.CustomerDto;
import org.example.digital_bank.service.BankServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
@AllArgsConstructor
public class BankController {
private BankServices bankServices;

@PostMapping
public ResponseEntity<CustomerDto> addcust(@RequestBody CustomerDto customerDto){
CustomerDto saved = bankServices.addCust(customerDto);
return new ResponseEntity<>(saved , HttpStatus.CREATED);
}
}
