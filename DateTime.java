import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        System.out.println("now usage"); // 현재 날찌 및 시간
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of() usagae"); // 날짜 및 시간 지정
        LocalDate dateof = LocalDate.of(2021, 3, 30);
        LocalTime timeof = LocalTime.of(22, 50, 0);

        System.out.println(dateof);
        System.out.println(timeof);
    }
}