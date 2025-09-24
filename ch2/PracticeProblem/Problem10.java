import java.util.Scanner;

public class Problem10 {
    /**
     * BMI 계산기
     *
     * 사용자의 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고 비만도를 판정하는 프로그램을 작성하세요.
     *
     * BMI 계산: 몸무게(kg) ÷ (키(m))²
     *
     * BMI 판정 기준:
     *
     * 18.5 미만: 저체중
     * 18.5 이상 25 미만: 정상체중
     * 25 이상 30 미만: 과체중
     * 30 이상: 비만
     * 입력 예시:
     *
     * 키(cm) 입력: 175
     * 몸무게(kg) 입력: 70
     * 예상 출력:
     *
     * 키: 175cm
     * 몸무게: 70kg
     * BMI: 22.86
     * 판정: 정상체중
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키(cm) 입력: ");
        float height = sc.nextFloat();
        System.out.println("몸무게(kg) 입력: ");
        float weight = sc.nextFloat();

        System.out.printf("키: %.0fcm\n", height);
        System.out.printf("몸무게: %.0fkg\n", weight);

        float BMI = weight / (height * height/10000);
        System.out.printf("BMI: %.2f\n", BMI);

        if (BMI < 18.5) {
            System.out.println("판정: 저체중");
        }
        else if (BMI < 25) {
            System.out.println("판정: 정상체중");
        }
        else if (BMI < 30) {
            System.out.println("판정: 과체중");
        }
        else{
            System.out.println("판정: 비만");
        }
    }
}
