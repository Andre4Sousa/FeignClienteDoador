package com.senac.doador.Dto;

import java.time.LocalDateTime;

public class DoacaoDto {

    private int id;

    private int valor;

    private int status;

    private LocalDateTime dataDoacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(LocalDateTime dataDoacao) {
        this.dataDoacao = dataDoacao;
    }
}
