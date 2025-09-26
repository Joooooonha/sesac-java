import java.util.Scanner;

public class Problem232 {
    /**
     * 9/25 실습시간 문제
     * 상품 할인 및 포인트 계산기
     * 상품의 원가와 할인율을 입력받아 고객이 지불할 최종 금액과 적립될 포인트를 계산하는 프로그램을 작성하세요.
     * 요구사항:
     * 상품 원가(original price)와 할인율(discount rate, %)을 Scanner를 통해 입력받습니다.
     * 최종 결제 금액 = 원가 × (1 - 할인율 / 100)
     * 최종 결제 금액은 10원 단위로 절삭합니다. (예: 24,588원 → 24,580원)
     * 포인트는 최종 결제 금액을 기준으로, 3만원 이상이면 5%, 3만원 미만이면 1%를 적립합니다. (삼항 연산자 활용)
     * 포인트는 소수점 이하를 버리고 정수형으로 저장합니다.
     * 입력 예시:
     * 상품의 원가를 입력하세요: 35800
     * 할인율(%)을 입력하세요: 15
     *
     *
     * 예상 출력:
     * === 결제 정보 ===
     * 상품 원가: 35,800원
     * 할인율: 15.0%
     * --------------------
     * 최종 결제 금액: 30,430원
     * 적립 포인트: 1,521점
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("상품의 원가를 입력하세요: ");
        long originalPrice = sc.nextLong();
        System.out.println("할인율(%)을 입력하세요: ");
        double discountRate = sc.nextDouble();

        System.out.println("---------------------");
        double discountedPrice = ((originalPrice * (1 - discountRate / 100))/10)*10;
        System.out.printf("최종 결제 금액: %d원\n", (int)discountedPrice);
        double points = (discountedPrice >= 30000) ? discountedPrice * 0.05 : discountedPrice * 0.03;
        System.out.printf("적립 포인트: %d점",(int)points);
    }
}
