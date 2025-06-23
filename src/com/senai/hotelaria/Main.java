package com.senai.hotelaria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel ( "Hortencia" , "São Paulo");
        hotel.exibirInformacoes();

        System.out.println();

        Quarto quarto = new Quarto (123, "Casal");
        quarto.desocuparQuarto();
        quarto.exibirInformacoes();

        System.out.println();

        Quarto quarto1 = new Quarto (1234, "Solteiro");
        quarto1.desocuparQuarto();
        quarto1.exibirInformacoes();

        System.out.println();

        Quarto quarto2 = new Quarto (12345, "Luxo");
        quarto2.ocuparQuarto();
        quarto2.exibirInformacoes();

        System.out.println();

        Cliente cliente = new Cliente("Jéss" ,"123.456.789-10", "jessbrenalp@gmail.com");
        cliente.exibirInformacoes();

        System.out.println();

        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFim = LocalDate.now().plusDays(5);

        System.out.println();

        Reserva reserva = new Reserva (cliente, quarto1,dataInicio, dataFim );
        reserva.exibirInformacoes();

        System.out.println();

        Funcionarios funcionario = new Funcionarios("Jéss", "Recepção");
        Funcionarios funcionario2 = new Funcionarios("Bianca", "Atendente");
        Funcionarios funcionario3 = new Funcionarios("Fábio", "Segurança");
        Funcionarios funcionario4 = new Funcionarios("Fábio", "Segurança");
        Funcionarios funcionario5 = new Funcionarios("Fábio", "Segurança");
        hotel.exibirInformacoes();

        Servico servico = new Servico ("Limpeza de quarto" ,1700.00);
        servico.exibirInformacoes();

        System.out.println();



    }
}
