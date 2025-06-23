package com.senai.hotelaria;

public class Funcionarios {
    // Atributos
    private String nome;
    private String cargo;
    // Construtor
    public Funcionarios(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("Cargo do Funcionário: " + cargo);
    }
}
