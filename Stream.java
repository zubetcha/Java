import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        // Stream 기본 구조
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("대구");
        list.add("서울");

        System.out.println(list);

        List<String> result = list.stream()
                .limit(2) // 앞의 두개만 남기고 다 제거하는 것
                .collect(Collectors.toList());
        System.out.println(result); // result 리스트는 위의 리스트와는 다른 별도의 리스트

        System.out.println("list -> transformation -> set");
        Set<String> set = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());
        System.out.println(set);

        // Array 를 Stream 으로 변환
        String[] arr = {"SQL", "Java", "Python"};
        java.util.stream.Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);

    }
}
