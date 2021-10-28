public class Switch {
    public static void main(String[] args) {

        char score = 'A';
        switch (score) {
            case 'A':
                System.out.println("A등급 축하합니다.");
                break; // 탈출
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
            default:
                System.out.println("C보다 아래 등급입니다."); // 모든 케이스에 해당하지 않는 경우 출력
        }
    }
}
