public class Problem2 {
    /**
     * 증감 연산자
     *
     * 다음 코드의 실행 결과를 예측하고, 실제로 실행하여 확인하는 프로그램을 작성하세요.
     *
     * int a = 5;
     * int b = ++a;  // 전위 증감
     * int c = a++;  // 후위 증감
     * int d = --a;  // 전위 감소
     * int e = a--;  // 후위 감소
     * 각 단계에서 a, b, c, d, e의 값을 출력하세요.
     *
     * 예상 출력:
     *
     * 초기값: a = 5
     * ++a 후: a = 6, b = 6
     * a++ 후: a = 7, c = 6
     * --a 후: a = 6, d = 6
     * a-- 후: a = 5, e = 6
     */
    public static void main(String[] args) {
        int a = 5;
        System.out.printf("초기값: a = %d\n", a);
        int b = ++a;  // 전위 증감
        System.out.printf("++a 후: a= %d, b=%d\n", a, b);
        int c = a++;  // 후위 증감
        System.out.printf("a++ 후: a= %d, c=%d\n", a, c);
        int d = --a;  // 전위 감소
        System.out.printf("--a 후: a= %d, d=%d\n", a, d);
        int e = a--;  // 후위 감소
        System.out.printf("a-- 후: a= %d, e=%d\n", a, e);
    }
}
