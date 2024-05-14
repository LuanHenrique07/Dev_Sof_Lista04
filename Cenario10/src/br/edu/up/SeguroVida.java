package br.edu.up;

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

    public String getDados() {
        return "";
    }
}
