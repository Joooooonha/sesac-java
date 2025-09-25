import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1 {
    /**
     * 산술 연산자 기초
     *
     * 두 정수를 입력받아 다음 산술 연산의 결과를 출력하는 프로그램을 작성하세요.
     *
     * 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지
     * 입력 예시:
     *
     * 첫 번째 수: 15
     * 두 번째 수: 4
     * 예상 출력:
     *
     * 15 + 4 = 19
     * 15 - 4 = 11
     * 15 * 4 = 60
     * 15 / 4 = 3
     * 15 % 4 = 3
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        System.out.println("첫 번째 수: ");
        int x1 = Integer.parseInt(br.readLine());
        System.out.println("두 번째 수: ");
        int x2 = Integer.parseInt(br.readLine());

        System.out.printf("%d + %d = %d\n", x1, x2, x1 + x2);
        System.out.printf("%d - %d = %d\n", x1, x2, x1 - x2);
        System.out.printf("%d * %d = %d\n", x1, x2, x1 * x2);
        System.out.printf("%d / %d = %d\n", x1, x2, x1 / x2);
        System.out.printf("%d %% %d = %d\n", x1, x2, x1 % x2);
    }
}
