import java.util.Scanner;

public class Problem12 {
    /**
     * 복합 데이터 타입 변환
     *
     * 다음 기능을 모두 포함하는 종합 프로그램을 작성하세요:
     *
     * 사용자로부터 생년월일(YYYY-MM-DD 형식)을 문자열로 입력받기
     * 년, 월, 일을 각각 정수로 분리하기
     * 현재 년도와 비교하여 나이 계산하기
     * 생년을 2진수, 8진수, 16진수로 출력하기
     * 각 자릿수의 합 구하기
     * 입력 예시:
     *
     * 생년월일 입력 (YYYY-MM-DD): 1995-03-15
     * 예상 출력:
     *
     * === 생년월일 분석 ===
     * 생년: 1995년
     * 생월: 3월
     * 생일: 15일
     * 나이: 28세
     *
     * === 생년 진법 변환 ===
     * 10진수: 1995
     * 2진수: 11111001011
     * 8진수: 3713
     * 16진수: 7cb
     *
     * === 생년 자릿수 분석 ===
     * 각 자릿수: 1, 9, 9, 5
     * 자릿수 합: 24
     * @param args
     */
    static int currentYear = 2023;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일 입력 (YYYY-MM-DD): ");

        String birthDate = sc.nextLine();

        String[] information = birthDate.split("-");

        System.out.println("=== 생년월일 분석 ===");
        System.out.printf("생년: %s\n", information[0]);
        System.out.printf("생월: %d\n", Integer.parseInt(information[1]));
        System.out.printf("생일: %s\n", information[2]);
        int birthYear = Integer.parseInt(information[0]);
        System.out.printf("나이: %d\n\n", 2023 - birthYear);

        System.out.printf("10진수: %d\n", birthYear);
        System.out.printf("2진수: %s\n", Integer.toBinaryString(birthYear));
        System.out.printf("8진수: %s\n", Integer.toOctalString(birthYear));
        System.out.printf("16진수: %s\n\n", Integer.toHexString(birthYear));

        System.out.println("=== 생년 자릿수 분석 ===");
        String[] yearInformation = information[0].split("");
        System.out.printf("각 자릿수: %s, %s, %s, %s\n", yearInformation[0], yearInformation[1], yearInformation[2], yearInformation[3]);
        System.out.printf("자릿수 합: %d",Integer.parseInt(yearInformation[0])+Integer.parseInt(yearInformation[1])+Integer.parseInt(yearInformation[2])+Integer.parseInt(yearInformation[3]));

    }
}
