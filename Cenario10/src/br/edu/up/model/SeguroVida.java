package br.edu.up.model;

public class SeguroVida extends Seguro {
    private boolean CobreDoenca;
    private boolean CobreAcidente;

    public boolean isCobreDoenca() {
        return CobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        CobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return CobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        CobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        return "Seguro de Vida [Cobre Doenca? = " + CobreDoenca + ", Cobre Acidente? = " + CobreAcidente + "]";
    }
}
