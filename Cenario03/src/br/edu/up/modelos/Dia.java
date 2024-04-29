package br.edu.up.modelos;


import java.util.ArrayList;
import java.util.List;

import br.edu.up.Prompt;

public class Dia {
    public int diaMes;
    public List<Compromisso> compromissos;

    public Dia(int diaMes){
        this.diaMes = diaMes;
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso comp){
        compromissos.add(comp);
    }

    public void excluirCompromisso(int hora){
        compromissos.removeIf(compromisso -> compromisso.hora == hora);
    }

    public void listarCompromissos(){
        for (Compromisso comp : compromissos) {
            Prompt.imprimir(comp.pessoa + " - " + comp.local + " - " + comp.assunto + " - " + comp.hora);
        }
    }
}