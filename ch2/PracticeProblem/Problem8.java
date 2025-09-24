public class Problem8 {
    /**
     * 변수의 스코프
     *
     * 다음 코드를 완성하여 변수의 스코프를 이해하는 프로그램을 작성하세요.
     *
     * public class VariableScope {
     *     static int globalVar = 100;  // 전역 변수
     *
     *     public static void main(String[] args) {
     *         int localVar = 10;       // 지역 변수
     *
     *         System.out.println("메인 메소드에서:");
     *         // globalVar와 localVar 출력
     *
     *         {
     *             int blockVar = 20;   // 블록 변수
     *             // 여기서 접근 가능한 변수들을 모두 출력
     *         }
     *
     *         // blockVar에 접근하려고 하면 어떻게 될까?
     *         // System.out.println(blockVar); // 주석 해제 시 오류 발생
     *     }
     * }
     */
    static int globalVar = 100;  // 전역 변수
    public static void main(String[] args) {
        int localVar = 10;

        System.out.println("메인 메소드에서:");
        System.out.println("globalVar = " + globalVar);
        System.out.println("localVar = " + localVar);

        {
            int blockVar = 20;
            System.out.println("globalVar = " + globalVar);
            System.out.println("localVar = " + localVar);
            System.out.println("blockVar = " + blockVar);
        }

//        System.out.println("blockVar = " + blockVar); //접근 범위 외 변수 접근으로 인해 오류 발생
    }
}
