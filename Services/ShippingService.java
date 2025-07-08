package Services;

import java.io.Console;

import Formatting.ConsoleColors;

public class ShippingService {

    public ShippingService() {
    }

    public static void ship(String address) {

        System.out
                .println(ConsoleColors.GREEN + "Shipping Service : Shipping book to " + address + ConsoleColors.RESET);
    }
}
