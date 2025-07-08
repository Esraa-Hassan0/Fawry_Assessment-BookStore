package Book;

import java.time.Year;

import Services.ShippingService;

public class PaperBook extends Book {

    private int quantity;

    public PaperBook(String ISBN, String title, double price, Year yearPublished, int quantity) {
        super(ISBN, title, price, yearPublished);
        this.quantity = quantity;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public String getType() {
        return "PaperBook";
    }

    @Override
    public double buy(String ISBN, int quantity, String email, String address) {
        if (quantity > this.quantity) {
            throw new RuntimeException("Not enough books in stock.");
        }
        this.quantity -= quantity;
        ShippingService.ship(address);
        return price * quantity;
    }


}
