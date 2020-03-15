import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date{
    private static DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d'.'M'.'y");
    public static String formatIt(LocalDateTime date){
        return date.format(formatDate);
    }
    public static LocalDate parseIt(String dateText) throws ParseException {
        return LocalDate.parse(dateText, formatDate);
    }
}
