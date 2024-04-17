package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args){

        Ponto ponto1 = new Ponto();
        ponto1.x = 0;
        ponto1.y = 0;
        
        Ponto ponto2 = new Ponto();
        ponto2.x = 2;
        ponto2.y = 5;
        
        
        
        System.out.println(ponto1.calcularDistania(ponto1, ponto2));
        
    }
  
}
