package br.com.phcs;

public abstract class BookstoreFactory {

    public Book create(String BookOrMagazine) {
        Book book = retrieveBook(BookOrMagazine);
        //book = prepareBook(book);
        return book;
    }

    //private Book prepareBook(Book book){}

    abstract Book retrieveBook(String BookOrMagazine);
}
