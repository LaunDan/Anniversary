package annniversary;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dater{
    private static DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d'.'M'.'y");

    public static String formatIt(LocalDate date){
        return date.format(formatDate);
    }

    public static LocalDate parseIt(String dateText) throws ParseException {
        return LocalDate.from(formatDate.parse(dateText));
    }
}
