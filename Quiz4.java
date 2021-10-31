// Quiz of Date / Time
// 오늘의 날짜와 시간을 [연도/월/일 시간/일자]의 형식으로 값으로 출력해보세요.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Quiz4 {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = dateFormatter.format(LocalDate.now());

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm/dd일");
        String myTime = timeFormatter.format(LocalDateTime.now());

        System.out.println(myDate + " " + myTime);

    }
}
