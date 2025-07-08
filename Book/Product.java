package Book;

public interface Product {

    boolean isForSale();

    String getISBN();

    String getType();

    double buy(String ISBN, int quantity, String email, String address);
};