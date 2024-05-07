package br.edu.up.controllers;

import br.edu.up.models.Carro;
import br.edu.up.models.Estacionamento;

public class Controlador {
    private Estacionamento estacionamento;

    public Controlador() {
        estacionamento = new Estacionamento();
    }

    public void registrarEntrada(String modelo, String placa, String cor) {
        Carro carro = new Carro(modelo, placa, cor);
        estacionamento.registrarEntrada(carro);
    }

    public void registrarSaida(String placa) {
        estacionamento.registrarSaida(placa);
    }

    public void gerarRelatorio() {
        estacionamento.gerarRelatorio();
    }
}
