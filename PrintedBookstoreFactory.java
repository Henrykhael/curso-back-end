package br.com.phcs;

public class PrintedBookstoreFactory extends BookstoreFactory{

    @Override
    Book retrieveBook(String BookOrMagazine) {
        if ("Book".equals(BookOrMagazine)) {
            return new PrintedBook( "Código Limpo", "Robert Cecil Martin", "Programing", 100);
        } else if ("Magazine".equals(BookOrMagazine)){
            return new PrintedMagazine( "Java Magazine", "Dev Media", "Programing", 55);
        }
        else {
            return null;
        }
    }
}
