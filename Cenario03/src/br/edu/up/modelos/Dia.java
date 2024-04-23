package br.edu.up.modelos;


import java.util.ArrayList;
import java.util.List;

import br.edu.up.Prompt;

public class Dia {
    public int diaMes;
    public Compromisso[] compromissos;
    public static List<Compromisso> listaCompro = new ArrayList<>();

    public Dia(int diaMes){
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso comp){
        this.listaCompro.add(comp);
    }
    
    public static void consultarCompromisso(int hora){
        for ( var compromisso : listaCompro) {
            Prompt.imprimir(compromisso);
        }
    }

    public void excluirCompromisso(int hora){
        
    }

    public static void listarCompromissos(){
    }

    public static List<Compromisso> getListaCompro() {
        return listaCompro;
    }

    public void setListaCompro(List<Compromisso> listaCompro) {
        this.listaCompro = listaCompro;
    } 
    

}
