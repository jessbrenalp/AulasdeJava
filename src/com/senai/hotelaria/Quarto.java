package com.senai.hotelaria;

public class Quarto {
    // Atributos
    private int numero;
    private String tipo;
    private boolean ocupado;
    // Construtor
    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false; // Por padrão, o quarto começa desocupado
    }
    // Método para ocupar o quarto
    public void ocuparQuarto() {
        this.ocupado = true;
    }
    // Método para desocupar o quarto
    public void desocuparQuarto() {
        this.ocupado = false;
    }
    // Método para exibir informações do quarto
    public void exibirInformacoes() {
        System.out.println("Número do Quarto: " + numero);
        System.out.println("Tipo do Quarto: " + tipo);
        System.out.println("Status: " + (ocupado ? "Ocupado" : "Desocupado"));
    }
}
