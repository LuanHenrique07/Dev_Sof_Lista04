package br.edu.up.modelos;

public class Ponto {
    public double x;
    public double  y;
    
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

    public double calcularDistania(Ponto ponto1, Ponto ponto2 ){
        double distancia = Math.pow(Math.sqrt(ponto1.x - ponto2.x), 2) 
        + Math.pow(Math.sqrt(ponto1.y - ponto2.y), 2);

        return distancia;
    }

    
}
