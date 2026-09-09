package org.example.digital_bank.repository;

import org.example.digital_bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRepo extends JpaRepository<Customer, Long> {
}
