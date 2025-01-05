package br.com.phcs;

public class Customer {

    private String BookOrMagazine;
    private boolean hasPrintedOrDigital;

    public Customer(boolean hasPrintedOrDigital, String bookOrMagazine) {
        this.hasPrintedOrDigital = hasPrintedOrDigital;
        this.BookOrMagazine = bookOrMagazine;
    }

    public String getBookOrMagazine() { return BookOrMagazine; }

    public boolean getHasPrintedOrDigital() { return hasPrintedOrDigital; }
}
