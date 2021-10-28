import javax.swing.text.Style;

public class Primitive {
    public static void main(String[] args) {

        // 숫자형
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 4;
        System.out.println(b);

        float f = 5.5F;
        System.out.println(f);

        double d = 5.5;
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 문자형
        // 문자형 character 은 글자 1개만 담을 수 있기 때문에 ''안에는 한 글자만 들어갈 수 있음
        // ex. 'ABC'; 와 같이 세글자인 경우 에러 발생
        char c = 'A';
        System.out.println(c);

        // 논리형
        boolean fact = true;
        fact = false;
        System.out.println(fact);

        // byte형
        byte data = 'd';
        System.out.println(data);
    }
}

