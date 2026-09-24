package org.example.digital_bank.entity;

import aj.org.objectweb.asm.ConstantDynamic;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter@AllArgsConstructor@NoArgsConstructor
@Table(name ="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
@Column(name = "name")
    private String name ;
@Column(name = "accno")

    private Long accno;
@Column(name = "accname")
    private String accname;
@Column(name = "typeofacc")
    private String typeofacc;
@Column(name = "pin")
private String pin;

    // Many Customers -> One Role (Clean Mapping)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Roles role;

    // One Customer -> Many Accounts
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accounts;


}
