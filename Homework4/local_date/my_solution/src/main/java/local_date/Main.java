package local_date;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;

public class Main {


    public Date convert( LocalDate date) {
        // todo finish this
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public LocalDateTime convert(Date date) {
        // todo finish this
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }


    // 1981/02/30&18:20
    public static int daysBetween(String firstDate, String lastDate) {
        //JSR 310
        //todo finish this
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd&HH:mm");
        LocalDateTime date1 = LocalDateTime.parse(firstDate, formatter);
        LocalDateTime date2 = LocalDateTime.parse(lastDate, formatter);
        return (int) Duration.between(date1, date2).toDays();
    }



    public static void main(String[] args) {

        System.out.println(Main.daysBetween("1981/02/30&18:20", "1983/02/30&18:20"));


    }
}
