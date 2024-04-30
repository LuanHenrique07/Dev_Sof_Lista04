package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Ano {
    public int ano;
    public boolean bissexto;
    public List<Mes> meses;

    public Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new ArrayList<>();
    }

    public void adicionarMes(Mes mes){
        meses.add(mes);
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora){
        for (Mes mes : meses) {
            if (mes.nome.equals(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                break;
            }
        }
    }

    public void listaCompromissos(String nomeMes){
        for (Mes mes : meses) {
            if (mes.nome.equals(nomeMes)) {
                mes.listaCompromissos();
                break;
            }
        }
    }

    public void listaCompromissos(){
        for (Mes mes : meses) {
            mes.listaCompromissos();
        }
    }
}
