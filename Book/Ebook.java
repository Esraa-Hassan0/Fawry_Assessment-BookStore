package Book;

import java.time.Year;
import Services.MailService;

public class Ebook extends Book {

    private String fileType;

    public Ebook(String ISBN, String title, double price, Year yearPublished, String fileType) {
        super(ISBN, title, price, yearPublished);
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public String getType() {
        return "Ebook";
    }

    @Override
    public double buy(String ISBN, int quantity, String email, String address) {
        if (quantity != 1) {
            throw new RuntimeException("Quantum book store: Only one eBook per purchase allowed.");
        }
        MailService.Send(email);
        return price;

    }

}
