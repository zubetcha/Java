import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Korea");
        list.add("Japan");
        list.add("France");
        Stream<String> stream = list.stream();
        stream.map(str -> str.toUpperCase()).forEach(it -> System.out.println(it));
    }
}
