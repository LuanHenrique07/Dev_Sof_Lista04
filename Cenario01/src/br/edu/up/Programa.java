package br.edu.up;

//import java.io.Console;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setCodigo("1598FHK");
        livro1.setTitulo("Core Java 2");
        livro1.setAutores("Cay S. Horstmann e Gary Cornell");
        livro1.setIsbn("0130819336");
        livro1.setAnoLivro(2005);

        Livro livro2 = new Livro();
        livro2.setCodigo("1598FHK");
        livro2.setTitulo("Java, Como programar");
        livro2.setAutores("Harvey Deitel"); 
        livro2.setIsbn("0130341517");
        livro2.setAnoLivro(2015);

        livro1.impressao();
        livro2.impressao();
    }
    
}
