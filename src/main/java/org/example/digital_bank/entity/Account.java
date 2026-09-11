package org.example.digital_bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Accounts")
@Setter@Getter@AllArgsConstructor@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="accno",unique = true,nullable = false)
    private Long accno;
    @Column(name = "accname", unique = true)
    private String accname;
    @Column(name = "typeofacc")
    private String typeofacc;

}
