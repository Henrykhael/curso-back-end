package br.com.phcs;

public class App {

    public static void main(String[] args) {
        Customer cliente = new Customer(true, "Book");
        BookstoreFactory factory = getFactory(cliente);
        Book book = factory.create(cliente.getBookOrMagazine());
        book.displayDetails();
    }

    private static BookstoreFactory getFactory(Customer cliente) {
        if (cliente.getHasPrintedOrDigital()) {
            return new PrintedBookstoreFactory();
        } else {
            return new DigitalBookstoreFactory();
        }
    }
}
