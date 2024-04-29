package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Mes {
    public String nome;
    public int qtdeDias;
    public List<Dia> dias;

    public Mes(String nome, int qtdeDias){
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new ArrayList<>();
        for (int i = 1; i <= qtdeDias; i++) {
            dias.add(new Dia(i));
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes){
        for (Dia dia : dias) {
            if (dia.diaMes == diaMes) {
                dia.adicionarCompromisso(comp);
                break;
            }
        }
    }

    public void excluirCompromisso(int diaMes, int hora){
        for (Dia dia : dias) {
            if (dia.diaMes == diaMes) {
                dia.excluirCompromisso(hora);
                break;
            }
        }
    }

    public void listaCompromissos(int diaMes){
        for (Dia dia : dias) {
            if (dia.diaMes == diaMes) {
                dia.listarCompromissos();
                break;
            }
        }
    }

    public void listaCompromissos(){
        for (Dia dia : dias) {
            dia.listarCompromissos();
        }
    }
}
