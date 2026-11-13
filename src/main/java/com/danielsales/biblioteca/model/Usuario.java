package com.danielsales.biblioteca.model;

public class Usuario {
    private String nome;
    private Integer idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf;
    }
}
