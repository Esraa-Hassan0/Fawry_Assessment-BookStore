package BookStore;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Formatting.ConsoleColors;
import Book.*;

public class BookStore {

    private Map<String, Book> inventory;

    public BookStore() {
        inventory = new HashMap<>();
    }

    public void addBooks(Book book) {
        inventory.put(book.getISBN(), book);
        System.out.println(
                ConsoleColors.PURPLE + "A new book with ISBN " + book.getISBN() + " was added" + ConsoleColors.RESET);
    }

    public List<Book> removeBooks(int maxGap) {
        List<Book> outdatedBooks = new ArrayList<>();
        for (Book book : new ArrayList<>(inventory.values())) {
            if (book.isOutdated(maxGap)) {
                inventory.remove(book.getISBN());
                System.out.println(ConsoleColors.RED + "Outdated Book with ISBN " + book.getISBN() + " has been removed "
                        + ConsoleColors.RESET);
                outdatedBooks.add(book);
            }
        }
        return outdatedBooks;
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        if (!inventory.containsKey(ISBN)) {
            System.out.println(ConsoleColors.RED);
            throw new RuntimeException("Book with ISBN " + ISBN + " was not found.");
        }
        Book foundBook = inventory.get(ISBN);
        double totalPrice = foundBook.buy(ISBN, quantity, email, address);
        System.out.println(ConsoleColors.BLUE + "Purchase complete, total paid: $" + totalPrice + ConsoleColors.RESET);
        return totalPrice;
    }
}
