package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args){

        // Pedidos 1 e 2 do Cenario 2
        Ponto ponto1 = new Ponto(0, 0);
        Ponto ponto2 = new Ponto(2, 5);

        // Pedido 3 
        double d1 = ponto1.calcularDistancia(ponto2);

        System.out.println("A distancia entre o ponto1 e o ponto2 eh: " + d1);

        // Pedido 4
        Ponto ponto3 = new Ponto(7, 2);

        double d2 = ponto2.calcularDistancia(ponto3);

        System.out.println("A distancia entre o ponto2 e o ponto3 eh: " + d2);

        // Pedidos 5 e 6
        ponto1.setX(10);
        ponto1.setY(3);

        double d3 = ponto1.calcularDistancia(ponto2);

        System.out.println("A distancia entre o ponto1 alterado e o ponto2 eh: " + d3);

    }
}
