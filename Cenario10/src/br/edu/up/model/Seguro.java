package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
    private String Apolice;
    private double VlrApolice;
    private LocalDate DtaInicio;
    private LocalDate DtaFim;

    public String getApolice() {
        return Apolice;
    }

    public void setApolice(String apolice) {
        Apolice = apolice;
    }

    public double getVlrApolice() {
        return VlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        VlrApolice = vlrApolice;
    }

    public LocalDate getDtaInicio() {
        return DtaInicio;
    }

    public void setDtaInicio(LocalDate dtaInicio) {
        DtaInicio = dtaInicio;
    }

    public LocalDate getDtaFim() {
        return DtaFim;
    }

    public void setDtaFim(LocalDate dtaFim) {
        DtaFim = dtaFim;
    }

    public abstract String getDados();

    @Override
    public String toString() {
        return "Seguro [Apolice = " + Apolice + ", Valor da Apolice = " + VlrApolice + ", Data do Inicio = " + DtaInicio
                + ", Data do Fim = "
                + DtaFim + "]";
    }

}
