public class Quiz3 {
    public static void main(String[] args) {
        // Quiz1. 1부터 100까지의 합을 구하는 반복문 코드를 작성해보세요.

        int i = 0;
        int sum = 0;
        while (i < 100) {
            sum += (i + 1);
            i++;
        }
        System.out.println(sum);

        //Quiz2. 5초부터 시작하는 카운트다운을 반복문을 사용하여 만들어보세요.

        int count = 5;
        while (count >= 0) {
            System.out.println("카운트다운:" + count);
            count--;
        }
        System.out.println("END");

        //Quiz3. 1부터 30까지 홀수의 합과 짝수의 합을 구하고 각각 출력하는 프로그램을 만들어보세요.

        int sum2 = 0;
        for (int x = 0; x < 31; x++) {
            if (x % 2 == 0) {
                sum2 += x;
            }
        }
        System.out.println(sum2);

        int sum3 = 0;
        int y = 0;
        while (y < 31) {
            if (y % 2 == 1) {
                sum3 += y;
            }
            y++;
        }
        System.out.println(sum3);
    }
}
