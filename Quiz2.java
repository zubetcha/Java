import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        // Quiz3. 입력받은 점수가 무슨 등급인지 출력해보세요.
        // (100~91점 : A등급 , 90점~81점 : B등급 , 80점~71점 : C등급 , 그 외의 점수 : F등급)
        // (참고로, 입력을 받는 코드는 아래와 같습니다.)

        Scanner sc = new Scanner(System.in);
        System.out.println("점수:");
        int score = sc.nextInt();

        if (score <= 100 && score >= 91) {
            System.out.println("A등급");
        } else if (score <= 90 && score >= 81) {
            System.out.println("B등급");
        } else if (score <= 80 && score >= 71) {
            System.out.println();
        } else {
            System.out.println("F등급");
        }

        sc.close();
    }
}
