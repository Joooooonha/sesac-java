public class Problem1 {
    /**
     * 변수 선언과 초기화
     *
     * 다음 변수들을 선언하고 적절한 값으로 초기화하는 프로그램을 작성하세요.
     *
     * 정수형 변수 age에 25 저장
     * 실수형 변수 height에 175.5 저장
     * 문자형 변수 grade에 'A' 저장
     * 불린형 변수 isStudent에 true 저장
     * 예상 출력:
     *
     * 나이: 25
     * 키: 175.5
     * 학점: A
     * 학생 여부: true
     */
    public static void main(String[] args) {
        int age = 25;
        float height = 175.5f;
        char grade = 'A';
        boolean isStudent = true;

        System.out.print("나이: "+age + "\n키: " + height + "\n학점: " + grade + "\n학생 여부: " + isStudent);
    }
}
