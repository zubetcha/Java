import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().reduce(0, Integer::sum));
    }
}
