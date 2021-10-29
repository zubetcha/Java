public class Exception {
    public static void main(String[] args) {
         int number = 10;
         int result = 0;

         for (int i = 10; i >= 0; i--) {
             try {
                 result = number / i;
                 System.out.println(result);
             } catch (java.lang.Exception e) {
                 System.out.println("Exception 발생: " + e.getMessage());
             } finally {
                 System.out.println("항상 실행되는 finally 구문");
             }
         }
    }
}
