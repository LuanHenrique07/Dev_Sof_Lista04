package br.edu.up;

//import java.io.Console;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.autores = "Cay S. Horstmann e Gary Cornell";
        livro1.isbn = "013081   9336";
        livro1.anoLivro = 2005;

        Livro livro2 = new Livro();
        livro2.codigo = "9865PLO";
        livro2.titulo = "Java, Como programar";
        livro2.autores = "Harvey Deitel";
        livro2.isbn = "0130341517";
        livro2.anoLivro = 2015;

        System.out.println(livro1.codigo + "\n" + livro1.titulo + "\n" + livro1.autores + "\n" + livro1.isbn + "\n" + livro1.anoLivro);
        System.out.println();
        System.out.println(livro2.codigo + "\n" + livro2.titulo + "\n" + livro2.autores + "\n" + livro2.isbn + "\n" + livro2.anoLivro);
    }
    
}
