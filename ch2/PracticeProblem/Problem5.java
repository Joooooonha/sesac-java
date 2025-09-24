import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem5 {
/**
 * 문자열과 기본 타입 변환
 *
 * 사용자로부터 문자열로 입력받은 값을 다양한 기본 타입으로 변환하는 프로그램을 작성하세요.
 *
 * 입력 예시:
 *
 * 정수 입력: 123
 * 실수 입력: 45.67
 * 불린 입력: true
 * 예상 출력:
 *
 * 문자열 "123"을 정수로: 123
 * 문자열 "45.67"을 실수로: 45.67
 * 문자열 "true"를 불린으로: true
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb= new StringBuilder();

        System.out.println("정수 입력: ");
        String stringToInt = br.readLine();
        System.out.println("실수 입력: ");
        String stringToDouble = br.readLine();
        System.out.println("불린 입력: ");
        String stringToBoolean = br.readLine();

        sb.append(Integer.parseInt(stringToInt)+"\n").append(Double.parseDouble(stringToDouble)+"\n").append(Boolean.parseBoolean(stringToBoolean)+"\n");
        System.out.println(sb);

    }
}
