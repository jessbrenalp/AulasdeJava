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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    // Método para adicionar um quarto
    public void adicionarQuarto(Quarto quarto) {
        if (quarto.isOcupado() == false) {
            quartos.add(quarto);
        }
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
