import java.util.Scanner;

public class Problem11 {
    /**
     * 시간 계산기
     *
     * 초 단위로 입력받은 시간을 시, 분, 초로 변환하여 출력하는 프로그램을 작성하세요.
     *
     * 입력 예시:
     *
     * 초 입력: 3665
     * 예상 출력:
     *
     * 3665초는 1시간 1분 5초입니다.
     * 추가 요구사항:
     *
     * 0초는 "0초"로 출력
     * 시간이 0이면 시간 부분 생략
     * 분이 0이면 분 부분 생략
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("초 입력: ");
        int timeInput=sc.nextInt();
        int hour=timeInput/3600;
        if(hour!=0) System.out.printf("%d시간 ",hour);

        int minute=(timeInput%3600)/60;
        if(minute!=0) System.out.printf("%d분 ",minute);

        int second=timeInput%60;
        System.out.printf("%d초 ",second);
    }
}
