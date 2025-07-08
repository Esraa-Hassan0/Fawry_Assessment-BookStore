package Services;

import Formatting.ConsoleColors;

public class MailService {

    public MailService() {
    }

    public static void Send(String email) {
        System.out.println(ConsoleColors.GREEN + "Mail Services : Sending ebook to " + email + ConsoleColors.RESET);
    }
}
