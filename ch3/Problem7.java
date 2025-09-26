import java.util.Scanner;

public class Problem7 {
    /**
     * 비트 연산자
     *
     * 두 정수를 입력받아 모든 비트 연산의 결과를 2진수와 10진수로 출력하는 프로그램을 작성하세요.
     *
     * AND (&), OR (|), XOR (^), NOT (~)
     * 좌시프트 (<<), 우시프트 (>>)
     * 입력 예시:
     *
     * 첫 번째 수: 12
     * 두 번째 수: 10
     * 예상 출력:
     *
     * 12 (1100) & 10 (1010) = 8 (1000)
     * 12 (1100) | 10 (1010) = 14 (1110)
     * 12 (1100) ^ 10 (1010) = 6 (0110)
     * ~12 = -13
     * 12 << 1 = 24 (11000)
     * 12 >> 1 = 6 (110)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수: ");
        long x1 = sc.nextLong();
        System.out.println("두 번째 수: ");
        long x2= sc.nextLong();

        System.out.printf("%d (%s) & %d (%s) = %d (%s)\n", x1, Long.toBinaryString(x1), x2, Long.toBinaryString(x2), x1 & x2, Long.toBinaryString(x1 & x2));
        System.out.printf("%d (%s) | %d (%s) = %d (%s)\n", x1, Long.toBinaryString(x1), x2, Long.toBinaryString(x2), x1 | x2, Long.toBinaryString(x1 | x2));
        System.out.printf("%d (%s) ^ %d (%s) = %d (%s)\n", x1, Long.toBinaryString(x1), x2, Long.toBinaryString(x2), x1 ^ x2, Long.toBinaryString(x1 ^ x2));
        //연산 결과 출력이 (0110)으로 안 나오고 (110)으로 나옴 4자리 다 출력하는 거 어케하지

        System.out.printf("~%d = %d\n", x1, ~x1);
        System.out.printf("%d << 1 = %d (%s)\n", x1, (x1 << 1), Long.toBinaryString(x1 << 1));
        System.out.printf("%d >> 1 = %d (%s)\n", x1, (x1 >> 1), Long.toBinaryString(x1 >> 1));
    }
}
