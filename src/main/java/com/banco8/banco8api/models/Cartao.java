package com.banco8.banco8api.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor


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
