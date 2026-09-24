package org.example.digital_bank.repository;

import io.jsonwebtoken.security.Jwks;
import org.example.digital_bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccRepo extends JpaRepository<Account,Long> {
    boolean  existsByAccNo (Long Accno);

}
