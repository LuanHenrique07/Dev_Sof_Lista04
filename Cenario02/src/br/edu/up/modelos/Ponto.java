package br.edu.up.modelos;

public class Ponto {
    public double x;
    public double  y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto ponto2) {
        return Math.sqrt(Math.pow(ponto2.x - this.x, 2) + Math.pow(ponto2.y - this.y, 2));
    }
}

