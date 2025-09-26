public class Problem8 {
    /**
     * 연산자 우선순위
     *
     * 다음 수식들의 결과를 연산자 우선순위에 따라 계산하는 프로그램을 작성하세요.
     *
     * int a = 10, b = 20, c = 30;
     *
     * // 수식들
     * int result1 = a + b * c;
     * int result2 = (a + b) * c;
     * int result3 = a > b ? a : b + c;
     * int result4 = a + b > c && b - a < c;
     * 각 수식의 계산 과정과 결과를 출력하세요.
     *
     * 예상 출력:
     *
     * a = 10, b = 20, c = 30
     *
     * result1 = a + b * c = 10 + (20 * 30) = 10 + 600 = 610
     * result2 = (a + b) * c = (10 + 20) * 30 = 30 * 30 = 900
     * result3 = a > b ? a : b + c = 10 > 20 ? 10 : 20 + 30 = false ? 10 : 50 = 50
     * result4 = a + b > c && b - a < c = 10 + 20 > 30 && 20 - 10 < 30 = 30 > 30 && 10 < 30 = false && true = false
     */

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
        System.out.printf("result1 = a + b * c = %d + (%d * %d) = %d + %d = %d\n", a, b, c, a, b * c, a + b * c);
        System.out.printf("result2 = (a+b) * c = (%d + %d) * %d = %d * %d = %d\n", a, b, c, a + b, c, (a + b) * c);
//        System.out.printf("result3 = (a > b ? a : b + c = %d > %d ? %d : %d + %d = %b ? %d : %d = %d\n"
//                                                        , )

    }
}
