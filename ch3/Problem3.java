import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    /**
     * 비교 연산자
     *
     * 사용자로부터 두 수를 입력받아 모든 비교 연산의 결과를 출력하는 프로그램을 작성하세요.
     *
     * 입력 예시:
     *
     * 첫 번째 수: 10
     * 두 번째 수: 20
     * 예상 출력:
     *
     * 10 == 20: false
     * 10 != 20: true
     * 10 > 20: false
     * 10 < 20: true
     * 10 >= 20: false
     * 10 <= 20: true
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("첫 번째 수: ");
        int x1 = Integer.parseInt(br.readLine());
        System.out.println("두 번째 수: ");
        int x2 = Integer.parseInt(br.readLine());

        System.out.printf("%d == %d: %b\n", x1, x2, x1 == x2);
        System.out.printf("%d != %d: %b\n", x1, x2, x1 != x2);
        System.out.printf("%d > %d: %b\n", x1, x2, x1 > x2);
        System.out.printf("%d < %d: %b\n", x1, x2, x1 < x2);
        System.out.printf("%d >= %d: %b\n", x1, x2, x1 >= x2);
        System.out.printf("%d <= %d: %b", x1, x2, x1 <= x2);

    }
}
