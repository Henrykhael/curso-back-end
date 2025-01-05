package br.com.phcs;

public abstract class Book {
    private String title;
    private String author;
    private String genre;
    private int price;

    public Book(String title, String author, String genre, int price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    //Exibe as informações gerais do livro ou revista.
    public void displayDetails(){
        System.out.println("\nTitulo: "+title+ "\nAutor: "+author+"\nGenero: "+genre+"\nPreço: "+price);
    }
}
