package com.banco8.banco8api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity

public class ContaBancaria {
    
    private Long id;
    private String numeroConta;
    private String agencia;
    private Double saldo;
    private LocalDateTime criadaEm;
    
    private Usuario titular;

}
