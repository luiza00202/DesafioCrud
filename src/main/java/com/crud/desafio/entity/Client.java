package com.crud.desafio.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cpf;
    private Double income;
    @Column(name = "birth_Date")
    private Instant birthDate;
    private int children;
}
