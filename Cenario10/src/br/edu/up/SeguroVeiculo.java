package br.edu.up;

public class SeguroVeiculo extends Seguro {
    private double VlrFranquia;
    private boolean TemCarroReserva;
    private boolean CobreVidros;

    public double getVlrFranquia() {
        return VlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        VlrFranquia = vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return TemCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        TemCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return CobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        CobreVidros = cobreVidros;
    }

    public String getDados() {
        return "";
    }
}
