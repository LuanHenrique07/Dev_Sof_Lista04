package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    public int diaMes;
    public Compromisso[] compromissos;
    List<String> listaCompro = new ArrayList<>();

    public Dia(int diaMes){
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso comp){
        
    }
    
    public static void consultarCompromisso(int hora){

    }

    public void excluirCompromisso(int hora){

    }

    public static void listarCompromissos(){
    }

    public List<String> getListaCompro() {
        return listaCompro;
    }

    public void setListaCompro(List<String> listaCompro) {
        this.listaCompro = listaCompro;
    } 
    

}
