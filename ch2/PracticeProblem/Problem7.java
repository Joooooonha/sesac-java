import java.util.Scanner;

public class Problem7 {
/**
 * 문제 7 ⭐⭐
 * Scanner를 이용한 입출력
 *
 * Scanner를 사용하여 사용자 정보를 입력받고 출력하는 프로그램을 작성하세요.
 *
 * 이름 (문자열)
 * 나이 (정수)
 * 키 (실수)
 * 결혼 여부 (불린)
 * 입력 예시:
 *
 * 이름: 김자바
 * 나이: 25
 * 키: 175.5
 * 결혼 여부: false
 * 예상 출력:
 *
 * === 입력된 정보 ===
 * 이름: 김자바
 * 나이: 25세
 * 키: 175.5cm
 * 결혼 여부: 미혼
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("이름: ");
        String name=input.nextLine();
        System.out.println("나이: ");
        int age = input.nextInt();
        System.out.println("키: ");
        float height = input.nextFloat();
        System.out.println("결혼 여부: ");
        boolean married = input.nextBoolean();

        System.out.println("=== 입력된 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height);
        System.out.println("결혼 여부: "+(married? "기혼":"미혼"));
    }
}