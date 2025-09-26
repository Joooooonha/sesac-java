import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6 {
    /**
     * 삼항 연산자
     * <p>
     * 다음 상황에서 삼항 연산자를 사용하는 프로그램을 작성하세요.
     * <p>
     * 두 수 중 큰 값 찾기
     * 숫자의 절댓값 구하기
     * 성적에 따른 등급 부여 (90이상: A, 80이상: B, 70이상: C, 나머지: D)
     * 입력 예시:
     * <p>
     * 첫 번째 수: -15
     * 두 번째 수: 8
     * 성적: 85
     * 예상 출력:
     * <p>
     * 더 큰 수: 8
     * -15의 절댓값: 15
     * 성적 85점의 등급: B
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫 번째 수: ");
        int x1=Integer.parseInt(br.readLine());
        System.out.println("두 번째 수: ");
        int x2=Integer.parseInt(br.readLine());
        System.out.println("성적: ");
        int score = Integer.parseInt(br.readLine());

        System.out.println("더 큰 수: "+((x1 > x2) ? x1 : x2));
        System.out.printf("%d의 절댓값: %d\n",x1,((x1 > 0) ? x1 : -x1));
        System.out.printf("성적 %d점의 등급: %c",score,(score>89)?'A':((score>79)?'B':((score>69)?'C':'D')));
    }
}
