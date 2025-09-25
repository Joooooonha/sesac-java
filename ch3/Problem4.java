import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {
    /**
     * 논리 연산자
     * <p>
     * 사용자의 나이와 면허 보유 여부를 입력받아 다음 조건을 만족하는지 확인하는 프로그램을 작성하세요.
     * <p>
     * 운전 가능: 18세 이상이고 면허가 있음
     * 음주 가능: 20세 이상
     * 투표 가능: 18세 이상
     * 입력 예시:
     * <p>
     * 나이: 19
     * 면허 보유 (true/false): true
     * 예상 출력:
     * <p>
     * 나이: 19세
     * 면허 보유: true
     * 운전 가능: true
     * 음주 가능: false
     * 투표 가능: true
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("나이: ");
        int age=Integer.parseInt(br.readLine());
        System.out.println("면허 보유 (true/false): ");
        boolean lisence = Boolean.parseBoolean(br.readLine());

        System.out.printf("나이: %d세\n", age);
        System.out.printf("면허 보유: %b\n", lisence);
        System.out.println("운전 가능: "+(age>17&&lisence));
        System.out.println("음주 가능: " + (age > 19));
        System.out.println("투표 가능: " + (age > 17));
    }
}
