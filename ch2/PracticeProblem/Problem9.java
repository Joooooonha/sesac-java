import java.util.Scanner;

public class Problem9 {
    /**
     * 문제 9 ⭐⭐⭐
     * 온도 변환기
     *
     * 섭씨온도를 화씨온도로, 화씨온도를 섭씨온도로 변환하는 프로그램을 작성하세요.
     *
     * 변환 공식:
     *
     * 화씨 = 섭씨 × 9/5 + 32
     * 섭씨 = (화씨 - 32) × 5/9
     * 입력 예시:
     *
     * 변환 방식을 선택하세요 (1: 섭씨→화씨, 2: 화씨→섭씨): 1
     * 섭씨온도 입력: 25
     * 예상 출력:
     *
     * 섭씨 25.0도는 화씨 77.0도입니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("변환 방식을 선택하세요 (1: 섭씨→화씨, 2: 화씨→섭씨): ");
        int calculateType = scanner.nextInt();
        float inputTemperature;

        if (calculateType == 1) {
            System.out.println("섭씨온도 입력: ");
            inputTemperature = scanner.nextInt();
            System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.", inputTemperature, inputTemperature * 9 / 5 + 32);
        }
        else{
            System.out.println("화씨온도 입력: ");
            inputTemperature = scanner.nextInt();
            System.out.printf("화씨 %.1f도는 섭씨 %.1f도입니다.", inputTemperature, (inputTemperature-32) * 9 / 5);
        }
    }
}
