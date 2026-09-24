package org.example.digital_bank.repository;

import org.example.digital_bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustRepo extends JpaRepository<Customer, Long> {
    Optional<Customer> findByName(String name );

}
