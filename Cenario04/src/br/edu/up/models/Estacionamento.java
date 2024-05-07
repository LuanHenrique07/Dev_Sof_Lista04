package br.edu.up.models;

import br.edu.up.Prompt;
import java.util.ArrayList;

public class Estacionamento {
    private int vagasDisponiveis = 10;
    private ArrayList<Carro> carrosEstacionados = new ArrayList<>();

    public void registrarEntrada(Carro carro) {
        if (vagasDisponiveis > 0) {
            carrosEstacionados.add(carro);
            vagasDisponiveis--;
            Prompt.imprimir("Carro entrou no estacionamento.");
        } else {
            Prompt.imprimir("Estacionamento lotado.");
        }
    }

    public void registrarSaida(String placa) {
        for (Carro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                carrosEstacionados.remove(carro);
                vagasDisponiveis++;
                Prompt.imprimir("Carro saiu do estacionamento.");
                return;
            }
        }
        Prompt.imprimir("Carro não encontrado no estacionamento.");
    }

    public void gerarRelatorio() {
        Prompt.imprimir("Relatório do Estacionamento:");
        Prompt.imprimir("Quantidade de carros estacionados: " + carrosEstacionados.size());
        Prompt.imprimir("Vagas disponíveis: " + vagasDisponiveis);
        Prompt.imprimir("Carros estacionados:");
        if(carrosEstacionados.size() > 0){
            for (Carro carro : carrosEstacionados) {
                Prompt.imprimir("Modelo: " + carro.getModelo() + ", Placa: " + carro.getPlaca());
            }
        }else{
            Prompt.imprimir("Não há carros estacionados!");
        }
    }
}
