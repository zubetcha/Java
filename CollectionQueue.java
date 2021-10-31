import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(5);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.poll()); // 완전히 꺼내는 메소드
        System.out.println(queue);
        System.out.println(queue.peek()); // 꺼내지 않고 확인만 하는 메소드 (스택과 동일)
        System.out.println(queue.size());
    }
}
