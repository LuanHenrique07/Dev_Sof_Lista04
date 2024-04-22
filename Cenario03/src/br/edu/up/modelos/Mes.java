package br.edu.up.modelos;

public class Mes {
    public int nome;
    public int qtdeDias;
    public Dia[] dias;

    public Mes(String nome, int qtdeDias){
        this.nome = nome;
        this.qtdeDias = qtdeDias;
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes){
        
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes){
        
    }

    public void excluirCompromisso(int diaMes, int hora){

    }

    public static void listaCompromissos(int diaMes){

    }

    public static void listaCompromisso(){
        
    }
}
