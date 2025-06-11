package com.banco8.banco8api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity

public class Transacao {
    
    private Long id;
    private String tipo; // "DEPOSITO", "SAQUE", "TRANSFERENCIA"
    private Double valor;
    private LocalDateTime dataHora;
    private String descricao;
    
    private ContaBancaria contaOrigem;
    private ContaBancaria contaDestino;

}
