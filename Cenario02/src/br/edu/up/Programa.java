package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args){

        Ponto ponto1 = new Ponto(2, 3);
        Ponto ponto2 = new Ponto(7, 8);
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println(distancia);
    }
}
