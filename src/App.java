import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Locale usLocale = Locale.US;
        Locale franceLocale = Locale.FRANCE;
        Locale japanLocale = Locale.JAPAN;

        LocalDate now = LocalDate.now();

        printFormattedDate(usLocale, now);
        printFormattedDate(franceLocale, now);
        printFormattedDate(japanLocale, now);

    }

    private static void printFormattedDate(Locale locale, LocalDate date) {
        out.println(locale.getLanguage());
        out.println(locale.getCountry());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM/d/yyyy", locale);
        out.println(formatter);
        DateTimeFormatter full = DateTimeFormatter.ofPattern("EEEE, MMMM, d, yyyy", locale);
        out.println(full);
        out.println();
    }
}
