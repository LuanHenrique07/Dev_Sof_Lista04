package br.edu.up.modelos;

import br.edu.up.Prompt;

public class Livro {
    private String codigo;
    private String titulo;
    private String autores;
    private String isbn;
    private int anoLivro;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getAnoLivro() {
        return anoLivro;
    }
    public void setAnoLivro(int anoLivro) {
        this.anoLivro = anoLivro;
    }

    public String impressao(){
        Prompt.imprimir("--------------Livro--------------");
        Prompt.imprimir("Código: " + codigo);
        Prompt.imprimir("Título: " + titulo);
        Prompt.imprimir("Autores: " + autores);
        Prompt.imprimir("ISBN: " + isbn);
        Prompt.imprimir("Ano: " + anoLivro);
        Prompt.imprimir("---------------------------------");
   
        return null;
    }

    
}
