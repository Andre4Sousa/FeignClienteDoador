package com.senac.doador.Dto;

public record CreateUserDto (

    int id,
    String nome,
    String endereco,
    int status
){}
