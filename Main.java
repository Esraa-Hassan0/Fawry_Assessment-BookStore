
// A test Class

import Book.*;
import BookStore.BookStore;
import java.time.Year;
import Formatting.ConsoleColors;

public class Main {

    public static void main(String[] args) {

        ///// scenario 1
        /// 
        ///* 
        // BookStore store = new BookStore();

        // store.addBooks(new PaperBook("001", "C++ Primer", 20.5, Year.of(2000), 10));
        // store.addBooks(new Ebook("002", "Learn Java", 30.0, Year.of(2020), "pdf"));
        // store.addBooks(new DemoBook("003", "The Great Demo", Year.of(2019)));

        // try {
        // store.buyBook("001", 20, "esraa@demo.com", "123 Cairo Street");
        // } catch (Exception e) {
        // System.out.println(ConsoleColors.RED);
        // System.out.println(e.getMessage());
        // }

        // try {
        // store.buyBook("007", 1, "esraa@demo.com", "");
        // } catch (Exception e) {
        // System.out.println(ConsoleColors.RED);
        // System.out.println(e.getMessage());
        // }

        // try {
        // store.buyBook("003", 10, "", "");
        // } catch (Exception e) {
        // System.out.println(ConsoleColors.RED);
        // System.out.println(e.getMessage());
        // }

        // store.removeBooks(10); // Remove books older than 10 years
        // */




        /// scenario 2
        BookStore store = new BookStore();

        store.addBooks(new PaperBook("001", "C++ Primer", 20.5, Year.of(2000), 10));
        store.addBooks(new Ebook("002", "Learn Java", 30.0, Year.of(2020), "pdf"));
        store.addBooks(new DemoBook("003", "The Great Demo", Year.of(2019)));

        try {
        store.buyBook("001", 2, "esraa@demo.com", "123 Cairo Street");
        } catch (Exception e) {
        System.out.println(ConsoleColors.RED);
        System.out.println(e.getMessage());
        }

        try {
        store.buyBook("002", 1, "esraa@demo.com", "");
        } catch (Exception e) {
        System.out.println(ConsoleColors.RED);
        System.out.println(e.getMessage());
        }

        try {
        store.buyBook("003", 1, "", "");
        } catch (Exception e) {
        System.out.println(ConsoleColors.RED);
        System.out.println(e.getMessage());
        }

        store.removeBooks(10); 
        
    }

}
