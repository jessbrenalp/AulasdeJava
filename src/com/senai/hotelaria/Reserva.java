package com.senai.hotelaria;

import java.time.LocalDate;
public class Reserva {
    // Atributos
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    // Construtor
    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate
            dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Método para exibir informações da reserva
    public void exibirInformacoes() {
        System.out.println("Informações da Reserva:");
        cliente.exibirInformacoes(); // Exibe as informações do cliente
        quarto.exibirInformacoes(); // Exibe as informações do quarto
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
    }
}