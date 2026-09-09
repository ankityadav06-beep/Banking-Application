package org.example.digital_bank.repository;

import org.example.digital_bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccRepo extends JpaRepository<Account,Long> {
}
