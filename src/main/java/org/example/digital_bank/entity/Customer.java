package org.example.digital_bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
