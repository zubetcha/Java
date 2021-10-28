import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        // 기본 자료형이 아닌 자료형은 모두 참조 자료형이다.

        String sparta = "Hello Sparta";
        System.out.println(sparta);

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));
    }
}
