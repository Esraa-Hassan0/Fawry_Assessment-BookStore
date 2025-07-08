package Book;

import java.time.Year;;

public abstract class Book implements Product {

    String ISBN, title;
    double price;
    Year yearPublished;

    public Book(String ISBN, String title, double price, Year yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public boolean isOutdated(int maxGap) {
        return ((Year.now().getValue() - yearPublished.getValue()) > maxGap);
    }

    public String getISBN() {
        return ISBN;
    }
}
