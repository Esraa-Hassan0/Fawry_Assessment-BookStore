package Book;

import java.time.Year;

public class DemoBook extends Book {

    public DemoBook(String ISBN, String title, Year yearPublished) {
        super(ISBN, title, 0.0, yearPublished);
    }
    
    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public double buy(String ISBN, int quantity, String email, String address) {
        throw new RuntimeException("Demo books are not for sale.");
    }

    @Override
    public String getType() {
        return "DemoBook";
    }

}
