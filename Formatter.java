import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter {
    public static void main(String[] args) {

        // Full / Long / Medium / Short 의 정해져 있는 형식을 사용할 경우

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat);

        // 나만의 형식으로 만들고 싶을 때

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = myFormatter.format(LocalDate.now());
        System.out.println(myDate);
    }
}
