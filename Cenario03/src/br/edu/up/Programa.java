package br.edu.up;

import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        Compromisso futebol = new Compromisso("Luan", "AVN", "Pelada", 19);
        Compromisso volei = new Compromisso("Jose", "Praça", "Volei", 21);

        Dia diaFutebol = new Dia(14);
        Mes mesFutebol = new Mes("Fevereiro", 29);
        mesFutebol.adicionarCompromisso(futebol, 30);
        diaFutebol.adicionarCompromisso(futebol);
        mesFutebol.listaCompromissos();

        Dia diaVolei = new Dia(30);
        Mes mesVolei = new Mes("Março", 30);
        diaVolei.adicionarCompromisso(volei);
        mesVolei.adicionarCompromisso(volei, 30);
        mesVolei.listaCompromissos();

        


        
    


    }
}
