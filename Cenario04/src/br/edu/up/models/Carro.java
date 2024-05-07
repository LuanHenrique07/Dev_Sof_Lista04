package br.edu.up.models;

public class Carro {
    private String Modelo;
    private String Cor;
    private String Placa;

    public Carro(String modelo, String placa, String cor) {
        Modelo = modelo;
        Cor = cor;
        Placa = placa;
    }

    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }

    
}
