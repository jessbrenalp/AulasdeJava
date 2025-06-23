package com.senai.hotelaria;

public class Servico {
    // Atributos
    private String descricao;
    private double custo;
    // Construtor
    public Servico(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }
    // Método para exibir informações do serviço
    public void exibirInformacoes() {
        System.out.println("Descrição do Serviço: " + descricao);
        System.out.println("Custo do Serviço: R$ " + custo);
    }
}
