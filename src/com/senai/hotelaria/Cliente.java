package com.senai.hotelaria;


public class Cliente {
    // Atributos
    private String nome;
    private String cpf;
    private String email;
    // Construtor
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    // Método para exibir informações do cliente
    public void exibirInformacoes() {
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("CPF do Cliente: " + cpf);
        System.out.println("Email do Cliente: " + email);
    }
}
