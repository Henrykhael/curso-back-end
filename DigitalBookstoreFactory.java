package br.com.phcs;

public class DigitalBookstoreFactory extends BookstoreFactory {
    @Override
    Book retrieveBook(String BookOrMagazine) {
        if ("Book".equals(BookOrMagazine)) {
            return new DigitalBook( "O Programador Pragmático", " Andrew Hunt", "Programing", 80);
        } else if ("Magazine".equals(BookOrMagazine)){
            return new DigitalMagazine( "Engenharia De Software Magazine", "Dev Media", "Programing", 40);
        }
        else {
            return null;
        }
    }
}
