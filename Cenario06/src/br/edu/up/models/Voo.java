package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String destino;
    private String data;
    private String horario;
    private String numeroVoo;
    private List<Passageiro> passageiros;

    public Voo(String destino, String data, String horario, String numeroVoo) {
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.numeroVoo = numeroVoo;
        this.passageiros = new ArrayList<>();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    @Override
    public String toString() {
        return "Voo{" +
                "destino='" + destino + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", numeroVoo='" + numeroVoo + '\'' +
                '}';
    }
}

