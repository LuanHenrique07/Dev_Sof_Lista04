package br.edu.up;

import br.edu.up.modelos.Compromisso;

public class Programa {
    public static void main(String[] args) throws Exception {
        Compromisso futebol = new Compromisso("Zanella", "AVN", "Bola", 14);

        System.out.println(futebol.getLocal());
    }
}
