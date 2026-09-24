package org.example.digital_bank.security;

import lombok.AllArgsConstructor;
import org.example.digital_bank.entity.Account;
import org.example.digital_bank.entity.Customer;
import org.example.digital_bank.repository.AccRepo;
import org.example.digital_bank.repository.CustRepo;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomUserSetailServ implements UserDetailsService {

    private CustRepo custRepo;
    private AccRepo accRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer= custRepo.findByName(username).orElseThrow(()->new UsernameNotFoundException("user doesnt exists"));
        String roleName = "ROLE_USER"; // Default value

        if (customer.getRole() != null && customer.getRole().getName() != null) {
            roleName = customer.getRole().getName();
        }
        return User.builder()
                .username(customer.getName())
                .password(customer.getPin())
                .authorities(Collections.singletonList(new SimpleGrantedAuthority(roleName)))
                .build();
    }

    public  String  accnoexists(Long accno) {
               boolean accnumber =accRepo.existsByAccNo(accno);
               if (accnumber){
                   return "account number already used ";
               }


    }
}
