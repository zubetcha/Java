public class For {
    public static void main(String[] ags) {

        // for 문
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

        // for-each 문
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day: days) {
            System.out.println(day);
        }

        // while 문
        int i = 0;
        int sum2 = 0;

        while (i < 10) {
            sum2 += (i + 1);
            i++;
            if (i == 5) {
                break;
            }
        }
        System.out.println(sum2);

        //do-while 문
        //선수행 후 조건에 맞으면 다시 돌아와서 수행
        int num = 0;
        int sum3 = 0;

        do {
            sum3 += (num + 1);
            num++;
        } while (num < 10);
        System.out.println(sum3);
    }
}
