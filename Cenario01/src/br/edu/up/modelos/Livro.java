package br.edu.up.modelos;

public class Livro {
    public String codigo;
    public String titulo;
    public String autores;
    public String isbn;
    public int anoLivro;

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
        System.out.println("--------------Livro--------------");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autores: " + autores);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + anoLivro);
        System.out.println("---------------------------------");
   
        return null;
    }

    
}
