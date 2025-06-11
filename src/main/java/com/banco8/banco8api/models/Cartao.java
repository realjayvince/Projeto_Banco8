package com.banco8.banco8api.models;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity

public class Cartao {
    private Long id;
    private String numeroCartao;
    private String nomeImpresso;
    private String validade;
    private String cvv;
    private Double limite;
    private Double limiteDisponivel;
    private ContaBancaria conta;
}
