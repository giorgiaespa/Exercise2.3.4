import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import static java.time.format.FormatStyle.*;

public class Main {
    public static void main(String[] args) {
        String toParse = "2023-03-01T13:00:00Z";
        System.out.println(dateTime(toParse));
        OffsetDateTime dateTime = dateTime(toParse);
        System.out.println("data iniziale: " + dateTime);
        System.out.println("aggiungi un anno: " + piuUno(dateTime));
        System.out.println("sottrai un mese: " + menoMese(dateTime));
        System.out.println("aggiungi sette giorni: " + piuSette(dateTime));
        System.out.println("Stampa risultato per Italia: " + perItalia(dateTime));
    }

    public static OffsetDateTime dateTime (String string) {
        OffsetDateTime dateTime = OffsetDateTime.parse(string);
        return dateTime;
    }

    public static OffsetDateTime piuUno(OffsetDateTime dateTime) {
        OffsetDateTime date = dateTime.plusYears(1);
        return date;
    }

    public static OffsetDateTime menoMese(OffsetDateTime dateTime) {
        OffsetDateTime date = dateTime.minusMonths(1);
        return date;
    }

    public static OffsetDateTime piuSette(OffsetDateTime dateTime) {
        OffsetDateTime date = dateTime.plusDays(7);
        return date;
    }

    public static String perItalia(OffsetDateTime dateTime) {
        String date = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));
        return date;
    }
}