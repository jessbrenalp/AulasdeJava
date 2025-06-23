package com.senai.hotelaria;

import java.util.ArrayList;
import java.util.List;
public class Hotel {
    // Atributos
    String nome;
    String endereco;
    List<Quarto> quartos;
    // Construtor
    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }
    // Método para adicionar um quarto
    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome do Hotel: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Quartos:");
        for (Quarto quarto : quartos) {
             quarto.exibirInformacoes();

        }
    }
}
