import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem6 {
    /**
     * 진법 변환 프로그램
     * <p>
     * 사용자가 입력한 10진수를 2진수, 8진수, 16진수로 변환하여 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력 예시:
     * <p>
     * 10진수 입력: 255
     * 예상 출력:
     * <p>
     * 10진수: 255
     * 2진수: 11111111
     * 8진수: 377
     * 16진수: ff
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        System.out.println("10진수 입력: ");
        long decimal = Long.parseLong(br.readLine());

        System.out.println("10진수: " + decimal);
        System.out.println("2진수: " + Long.toBinaryString(decimal));
        System.out.println("8진수: " + Long.toOctalString(decimal));
        System.out.println("16진수: " + Long.toHexString(decimal));
    }
}
