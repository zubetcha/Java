public class Ternary {
    public static void main(String[] args) {
        // Ternart Operator 삼항 연산자
        // String 변수의 값이 논리 조건이  true면 왼쪽을, false면 오른쪽을 출력하도록 하는 연산자

        int a = 5;
        String result = ( a < 10 ) ? "10보다 작습니다." : "10보다 큽니다.";
        System.out.println(result); // "10보다 작습니다."
    }
}
