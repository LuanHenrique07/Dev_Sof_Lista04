package br.edu.up.modelos;

public class Ponto {
    public double x;
    public double y;
    public double d;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        d = Math.sqrt(Math.pow(this.x - outroPonto.getX(), 2) + Math.pow(this.y - outroPonto.getY(), 2));
        return d;
    }
}

