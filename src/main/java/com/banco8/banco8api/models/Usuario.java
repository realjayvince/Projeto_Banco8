package com.banco8.banco8api.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;

    private ContaBancaria conta;

}

