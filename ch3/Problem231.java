import java.util.Scanner;

public class Problem231 {
    /**
     * 9/25 실습시간 문제
     * 간단한 이자 계산기
     * 사용자로부터 원금, 연이율(%), 예치 기간(년)을 입력받아, 최종적으로 받게 될 총액과 이자 수익을 계산하는 프로그램을 작성하세요.
     * 요구사항:
     * 원금(principal), 연이율(interest rate), 기간(years)을 Scanner를 통해 입력받습니다.
     * 이자 계산 방식은 단리(Simple Interest)를 사용합니다.
     * 이자 수익 = 원금 × (연이율 / 100) × 기간
     * 최종 총액 = 원금 + 이자 수익
     * 결과는 정수(원) 단위로 소수점 이하는 버리고 출력하세요. (강제 타입 변환 활용)
     * 입력 예시:
     * 원금을 입력하세요: 1000000
     * 연이율(%)을 입력하세요: 5.5
     * 예치 기간(년)을 입력하세요: 3
     *
     *
     * 예상 출력:
     * === 최종 계산 결과 ===
     * 원금: 1,000,000원
     * 연이율: 5.5%
     * 기간: 3년
     * --------------------
     * 총 이자 수익: 165,000원
     * 최종 수령액: 1,165,000원
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원금을 입력하세요: ");
        long principal = sc.nextLong();
        System.out.println("연이율(%)을 입력하세요: ");
        double interestRate = sc.nextDouble();
        System.out.println("예치 기간(년)을 입력하세요: ");
        int years = sc.nextInt();

        System.out.println("=== 최종 계산 결과 ===");
        System.out.printf("원금: %d원\n", principal);
        System.out.printf("연이율: %.1f%%\n", interestRate);
        System.out.printf("기간: %d년\n-----------------\n", years);
        long interestResult = (int) (principal * (interestRate / 100) * years);
        System.out.printf("총 이자 수익: %d원\n", interestResult);
        System.out.printf("최종 수령액: %d", principal+interestResult);
//        원 단위 ',' 표시 ?
    }
}
