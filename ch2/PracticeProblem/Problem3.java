public class Problem3 {
    /**
     * 자동 타입 변환
     *
     * 다음 상황에서 자동 타입 변환이 어떻게 일어나는지 확인하는 프로그램을 작성하세요.
     *
     * byte b = 10;
     * int i = b;        // byte → int
     * long l = i;       // int → long
     * float f = l;      // long → float
     * double d = f;     // float → double
     * 각 단계에서 변수의 값과 타입을 출력하세요.
     *
     * 예상 출력:
     *
     * byte b = 10
     * int i = 10
     * long l = 10
     * float f = 10.0
     * double d = 10.0
     */

    public static void main(String[] args) {
        byte b = 10;
        int i = b;        // byte → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double

        System.out.println("byte b = " + b);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
    }
}
